package com.jcse.exception.security.hash;

public class UnsupportedHashAlgorithmException extends HashException {
    private static final long serialVersionUID = 1L;

    public UnsupportedHashAlgorithmException() {}

    public UnsupportedHashAlgorithmException(String message, Throwable cause) { super(message, cause); }

    public UnsupportedHashAlgorithmException(Throwable cause) { super(cause); }

    public UnsupportedHashAlgorithmException(String message) { super(message); }

    public UnsupportedHashAlgorithmException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
