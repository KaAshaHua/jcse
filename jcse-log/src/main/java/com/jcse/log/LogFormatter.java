package com.jcse.log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import com.jcse.util.Ansi.Foreground;
import com.jcse.util.Ansi.TextStyle;

import static com.jcse.util.Ansi.*;

public class LogFormatter {
    private static final DateTimeFormatter TIME = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS").withZone(ZoneId.systemDefault());
    private static final String RESET = reset();
    private static final int LEVEL_WIDTH = 5;
    private final boolean colored;

    public LogFormatter() { this(false); }

    public LogFormatter(boolean colored) { this.colored = colored; }

    public String format(LogRecord record) {
        StringBuilder sb = new StringBuilder(160);

        if (this.colored) 
            sb.append(this.colorOf(record.level()));
        this.appendHeader(sb, record);
        sb.append(record.message());
        if (this.colored)
            sb.append(RESET);
        sb.append(System.lineSeparator());
        if (record.throwable() != null)
            appendThrowable(sb, record.throwable());
        return sb.toString();
    }

    protected void appendHeader(StringBuilder sb, LogRecord record) {
        sb.append(TIME.format(record.time()))
          .append(" [").append(record.threadName()).append("] ");
        String level = LogLevel.levelToString(record.level());
        sb.append(level);
        for (int i = level.length(); i < LEVEL_WIDTH; i++) {
            sb.append(' ');
        }
        sb.append(' ').append(record.loggerName()).append(" - ");
    }

    protected void appendThrowable(StringBuilder sb, Throwable throwable) {
        StringWriter buffer = new StringWriter();
        PrintWriter writer = new PrintWriter(buffer);
        throwable.printStackTrace(writer);
        writer.flush();
        sb.append(buffer);
    }

    protected String colorOf(int level) {
        return switch(level) {
            case LogLevel.TRACE -> esc + start + Foreground.BRIGHT_BLACK + end;
            case LogLevel.DEBUG -> esc + start + Foreground.CYAN + end;
            case LogLevel.INFO -> esc + start + Foreground.GREEN + end;
            case LogLevel.WARN -> esc + start + Foreground.YELLOW + end;
            case LogLevel.ERROR -> esc + start + Foreground.RED + end;
            case LogLevel.FATAL -> esc + start + TextStyle.BOLD + ";" + Foreground.RED + end;
            default -> "";
        };
    }
}
