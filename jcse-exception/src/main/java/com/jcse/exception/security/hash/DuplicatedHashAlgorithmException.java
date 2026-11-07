package com.jcse.exception.security.hash;

public class DuplicatedHashAlgorithmException extends HashException {
    private static final long serialVersionUID = 1L;

    public DuplicatedHashAlgorithmException() {}

    public DuplicatedHashAlgorithmException(String message, Throwable cause) { super(message, cause); }

    public DuplicatedHashAlgorithmException(Throwable cause) { super(cause); }

    public DuplicatedHashAlgorithmException(String message) { super(message); }

    public DuplicatedHashAlgorithmException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
