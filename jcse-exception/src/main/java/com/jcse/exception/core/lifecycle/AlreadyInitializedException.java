package com.jcse.exception.core.lifecycle;

public class AlreadyInitializedException extends LifecycleException {
    private static final long serialVersionUID = 1L;

    public AlreadyInitializedException() {}

    public AlreadyInitializedException(String message) { super(message); }

    public AlreadyInitializedException(String message, Throwable cause) { super(message, cause); }

    public AlreadyInitializedException(Throwable cause) { super(cause); }

    public AlreadyInitializedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
