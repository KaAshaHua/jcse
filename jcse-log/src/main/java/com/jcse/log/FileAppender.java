package com.jcse.log;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

public class FileAppender extends Appender {
    private static final int BUFFER_SIZE = 8 * 1024;

    private final Path path;
    private final long maxBytes;
    private final int maxBackups;
    private final boolean flushEveryLine;

    private OutputStream out;
    private long currentBytes;
    private long rotateAtBytes;

    public FileAppender(LogFormatter formatter, Path path, long maxBytes, int maxBackups, boolean flushEveryLine) {
        super(formatter);
        this.path = Objects.requireNonNull(path, "path").toAbsolutePath();
        if (maxBytes <= 0) {
            throw new IllegalArgumentException("maxBytes must be > 0, got " + maxBytes);
        }
        if (maxBackups < 1) {
            throw new IllegalArgumentException("maxBackups must be >= 1, got " + maxBackups);
        }
        this.maxBytes = maxBytes;
        this.maxBackups = maxBackups;
        this.flushEveryLine = flushEveryLine;
        this.rotateAtBytes = maxBytes;
        try {
            open();
        } catch (IOException e) {
            throw new UncheckedIOException("Cannot open log file: " + this.path, e);
        }
    }

    public Path getPath() {
        return path;
    }

    @Override
    protected void write(String formattedText, LogRecord record) throws IOException {
        byte[] bytes = formattedText.getBytes(StandardCharsets.UTF_8);   
        if (currentBytes > 0 && currentBytes + bytes.length > rotateAtBytes) {
            rotate();
        }
        out.write(bytes);
        currentBytes += bytes.length;
        if (flushEveryLine || record.level().isEnabledFor(LogLevel.WARN)) {
            out.flush();
        }
    }

    @Override
    protected void doFlush() throws IOException {
        out.flush();
    }

    @Override
    protected void doClose() throws IOException {
        out.close();
    }

    private void open() throws IOException {
        Path parent = path.getParent();
        if (parent != null) {
            Files.createDirectories(parent);
        }
        currentBytes = Files.exists(path) ? Files.size(path) : 0L;
        out = new BufferedOutputStream(
                Files.newOutputStream(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND),
                BUFFER_SIZE);
    }

    private void rotate() throws IOException {
        out.close();   
        try {
            shiftBackups();
            open();
            rotateAtBytes = maxBytes;
        } catch (IOException e) {
            System.err.println("[jces-log] cannot rotate " + path + ": " + e);
            open();   
            rotateAtBytes = currentBytes + maxBytes;
        }
    }

    private void shiftBackups() throws IOException {
        Files.deleteIfExists(backup(maxBackups));
        for (int i = maxBackups - 1; i >= 1; i--) {
            Path source = backup(i);
            if (Files.exists(source)) {
                Files.move(source, backup(i + 1), StandardCopyOption.REPLACE_EXISTING);
            }
        }
        Files.move(path, backup(1), StandardCopyOption.REPLACE_EXISTING);
    }

    private Path backup(int index) {
        return path.resolveSibling(path.getFileName() + "." + index);
    }
}