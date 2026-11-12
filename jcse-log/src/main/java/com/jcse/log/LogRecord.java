package com.jcse.log;

import java.time.Instant;
import java.util.Objects;

public record LogRecord(
    Instant time,
    LogLevel level,
    String loggerName,
    String threadName,
    String message,
    Throwable throwable
) {
    public LogRecord {
        Objects.requireNonNull(time, "time");
        Objects.requireNonNull(level, "level");
        Objects.requireNonNull(loggerName, "loggerName");
        Objects.requireNonNull(threadName, "threadName");
        Objects.requireNonNull(message, "message");
    }
}