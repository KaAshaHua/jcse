package com.jcse.exception.log;

public class LogAppenderException extends LogException {
    private static final long serialVersionUID = 1L;

    public LogAppenderException() {}

    public LogAppenderException(String message) { super(message); }

    public LogAppenderException(String message, Throwable cause) { super(message, cause); }

    public LogAppenderException(Throwable cause) { super(cause); }

    public LogAppenderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
