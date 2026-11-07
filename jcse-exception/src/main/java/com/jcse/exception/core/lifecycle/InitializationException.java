package com.jcse.exception.core.lifecycle;

public class InitializationException extends LifecycleException {
    private static final long serialVersionUID = 1L;

    public InitializationException() {}

    public InitializationException(String message) { super(message); }

    public InitializationException(String message, Throwable cause) { super(message, cause); }

    public InitializationException(Throwable cause) { super(cause); }

    public InitializationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
