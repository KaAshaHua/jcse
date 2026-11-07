package com.jcse.exception.core.resource;

public class UnsupportedResourceTypeException extends ResourceException {
    private static final long serialVersionUID = 1L;

    public UnsupportedResourceTypeException() {}

    public UnsupportedResourceTypeException(String message) { super(message); }

    public UnsupportedResourceTypeException(String message, Throwable cause) { super(message, cause); }

    public UnsupportedResourceTypeException(Throwable cause) { super(cause); }

    public UnsupportedResourceTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
