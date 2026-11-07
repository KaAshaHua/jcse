package com.jcse.exception.format;

public class MappingException extends FormatException {
    private static final long serialVersionUID = 1L;

    public MappingException() {}

    public MappingException(String message) { super(message); }

    public MappingException(String message, Throwable cause) { super(message, cause); }

    public MappingException(Throwable cause) { super(cause); }

    public MappingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
