package com.jcse.exception.core.resource;

public class ResourceAlreadyExistsException extends ResourceException {
    private static final long serialVersionUID = 1L;

    public ResourceAlreadyExistsException() {}

    public ResourceAlreadyExistsException(String message) { super(message); }

    public ResourceAlreadyExistsException(String message, Throwable cause) { super(message, cause); }

    public ResourceAlreadyExistsException(Throwable cause) { super(cause); }

    public ResourceAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
