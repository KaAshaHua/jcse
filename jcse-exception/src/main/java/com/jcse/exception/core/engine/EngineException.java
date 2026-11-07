package com.jcse.exception.core.engine;

import com.jcse.exception.core.CoreException;

public class EngineException extends CoreException {
    private static final long serialVersionUID = 1L;

    public EngineException() {}

    public EngineException(String message) { super(message); }

    public EngineException(String message, Throwable cause) { super(message, cause); }

    public EngineException(Throwable cause) { super(cause); }

    public EngineException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
