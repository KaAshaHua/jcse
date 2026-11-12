package com.jcse.log;

import java.util.*;

public class LogLevel {
    public static final int TRACE = 0;
    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int WARN = 3;
    public static final int ERROR = 4;
    public static final int FATAL = 5;
    public static final int OFF = Integer.MAX_VALUE;

    private int severity;

    public LogLevel(int severity) { this.severity = severity; }

    public int getSeverity() { return this.severity; }

    public void setSeverity(int newSeverity) { this.severity = newSeverity; }

    public boolean isEnableFor(int threshold) { return this.severity <= threshold; }

    public static String levelToString(int level) {
        switch (level) {
            case TRACE: return "TRACE";
            case DEBUG: return "DEBUG";
            case INFO: return "INFO";
            case WARN: return "WARN";
            case ERROR: return "ERROR";
            default: return "FATAL";
        }
    }

    public static int parse(String text) {
        switch (text.trim().toUpperCase(Locale.ROOT)) {
            case "TRACE": return TRACE;
            case "DEBUG": return DEBUG;
            case "INFO": return INFO;
            case "WARN": return WARN;
            case "ERROR": return ERROR;
            case "FATAL": return FATAL;
            default: return OFF;
        }
    }
}
