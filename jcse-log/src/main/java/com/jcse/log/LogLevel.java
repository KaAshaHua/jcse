package com.jcse.log;

import java.util.Locale;

public enum LogLevel {
    TRACE(0),
    DEBUG(1),
    INFO(2),
    WARN(3),
    ERROR(4),
    FATAL(5),
    OFF(Integer.MAX_VALUE);

    private final int severity;

    LogLevel(int severity) { this.severity = severity; }

    public int severity() { return severity; }

    public boolean isEnabledFor(LogLevel threshold) {
        return severity >= threshold.severity();
    }

    public static LogLevel parse(String text, LogLevel fallback) {
        if (text == null) 
            return fallback;
        try {
            return valueOf(text.trim().toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            return fallback;
        }
    }
}