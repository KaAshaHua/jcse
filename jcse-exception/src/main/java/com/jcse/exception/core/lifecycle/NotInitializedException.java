package com.jcse.exception.core.lifecycle;

public class NotInitializedException extends LifecycleException {
    private static final long serialVersionUID = 1L;

    public NotInitializedException() {}

    public NotInitializedException(String message) { super(message); }

    public NotInitializedException(String message, Throwable cause) { super(message, cause); }

    public NotInitializedException(Throwable cause) { super(cause); }

    public NotInitializedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
