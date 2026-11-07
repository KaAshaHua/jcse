package com.jcse.exception.log;

public class LogFormatException extends LogException {
    private static final long serialVersionUID = 1L;

    public LogFormatException() {}

    public LogFormatException(String message) { super(message); }

    public LogFormatException(String message, Throwable cause) { super(message, cause); }

    public LogFormatException(Throwable cause) { super(cause); }

    public LogFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
