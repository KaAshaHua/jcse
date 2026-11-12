package com.jcse.log;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

public abstract class Appender implements AutoCloseable {
    private final ReentrantLock lock = new ReentrantLock();
    private final AtomicBoolean failureReported = new AtomicBoolean(false);
    private final LogFormatter formatter;
    private volatile LogLevel threshold = LogLevel.TRACE;
    private volatile boolean closed;

    protected Appender(LogFormatter formatter) {
        this.formatter = Objects.requireNonNull(formatter, "formatter");
    }

    @Override 
    public final void close() {
        lock.lock();
        try {
            if (closed) return;
            closed = true;
            try { doFlush(); }
            finally { doClose(); }
        } catch (Exception e) { reportFailure(e); }
        finally { lock.unlock(); }
    }

    public final void append(LogRecord record) {
        if (closed || !record.level().isEnabledFor(this.threshold)) return;
        try {
            String txt = formatter.format(record);
            lock.lock();
            try {
                if (closed) return;
                write(txt, record);
            } finally { lock.unlock(); }
        } catch (Exception e) { reportFailure(e); }
    }

    public final void flush() {
        lock.lock();
        try {
            if (closed) return;
            doFlush();
        } catch (Exception e) { reportFailure(e); }
        finally { lock.unlock(); }
    }

    public LogLevel getThreshold() { return this.threshold; }

    public void setThreshold(LogLevel newThreshold) { 
        this.threshold = Objects.requireNonNull(newThreshold, "newThreshold"); 
    }

    public boolean isClosed() { return this.closed; }

    private void reportFailure(Exception e) {
        if (failureReported.compareAndSet(false, true)) {
            System.err.println("[jces-log] " + getClass().getSimpleName()
            + " failed (further failures suppressed): " + e);
        }
    }
    
    protected abstract void write(String formattedText, LogRecord record) throws IOException;

    protected void doFlush() throws IOException {}

    protected void doClose() throws IOException {}
}
