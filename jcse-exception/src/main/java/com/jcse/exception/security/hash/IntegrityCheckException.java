package com.jcse.exception.security.hash;

public class IntegrityCheckException extends HashException {
    private static final long serialVersionUID = 1L;

    public IntegrityCheckException() {}

    public IntegrityCheckException(String message, Throwable cause) { super(message, cause); }

    public IntegrityCheckException(Throwable cause) { super(cause); }

    public IntegrityCheckException(String message) { super(message); }

    public IntegrityCheckException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
