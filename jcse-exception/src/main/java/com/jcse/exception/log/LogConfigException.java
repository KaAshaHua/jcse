package com.jcse.exception.log;

public class LogConfigException extends LogException {
    private static final long serialVersionUID = 1L;

    public LogConfigException() {}

    public LogConfigException(String message) { super(message); }

    public LogConfigException(String message, Throwable cause) { super(message, cause); }

    public LogConfigException(Throwable cause) { super(cause); }

    public LogConfigException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
