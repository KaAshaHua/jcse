package com.jcse.exception.core.resource;

public class ResourceLoadException extends ResourceException {
    private static final long serialVersionUID = 1L;

    public ResourceLoadException() {}

    public ResourceLoadException(String message) { super(message); }

    public ResourceLoadException(String message, Throwable cause) { super(message, cause); }

    public ResourceLoadException(Throwable cause) { super(cause); }

    public ResourceLoadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
