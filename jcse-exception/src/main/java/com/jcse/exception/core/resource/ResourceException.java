package com.jcse.exception.core.resource;

import com.jcse.exception.core.CoreException;

public class ResourceException extends CoreException {
    private static final long serialVersionUID = 1L;

    public ResourceException() {}

    public ResourceException(String message) { super(message); }

    public ResourceException(String message, Throwable cause) { super(message, cause); }

    public ResourceException(Throwable cause) { super(cause); }

    public ResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
