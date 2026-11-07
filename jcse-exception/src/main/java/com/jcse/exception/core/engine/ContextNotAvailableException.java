package com.jcse.exception.core.engine;

public class ContextNotAvailableException extends EngineException {
    private static final long serialVersionUID = 1L;

    public ContextNotAvailableException() {}

    public ContextNotAvailableException(String message) { super(message); }

    public ContextNotAvailableException(String message, Throwable cause) { super(message, cause); }

    public ContextNotAvailableException(Throwable cause) { super(cause); }

    public ContextNotAvailableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
