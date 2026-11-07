package com.jcse.exception.core.resource;

public class ResourceCacheException extends ResourceException {
    private static final long serialVersionUID = 1L;

    public ResourceCacheException() {}

    public ResourceCacheException(String message) { super(message); }

    public ResourceCacheException(String message, Throwable cause) { super(message, cause); }

    public ResourceCacheException(Throwable cause) { super(cause); }

    public ResourceCacheException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
