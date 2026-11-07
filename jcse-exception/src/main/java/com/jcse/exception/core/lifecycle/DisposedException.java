package com.jcse.exception.core.lifecycle;

public class DisposedException extends LifecycleException {
    private static final long serialVersionUID = 1L;

    public DisposedException() {}

    public DisposedException(String message) { super(message); }

    public DisposedException(String message, Throwable cause) { super(message, cause); }

    public DisposedException(Throwable cause) { super(cause); }

    public DisposedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
