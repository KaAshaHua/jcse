package com.jcse.exception.core.engine;

public class EngineBuildException extends EngineException {
    private static final long serialVersionUID = 1L;

    public EngineBuildException() {}

    public EngineBuildException(String message) { super(message); }

    public EngineBuildException(String message, Throwable cause) { super(message, cause); }

    public EngineBuildException(Throwable cause) { super(cause); }

    public EngineBuildException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
