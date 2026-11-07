package com.jcse.exception.security.hash;

public class HashAlgorithmCanNotRegistryException extends HashException {
    private static final long serialVersionUID = 1L;

    public HashAlgorithmCanNotRegistryException() {}

    public HashAlgorithmCanNotRegistryException(String message, Throwable cause) { super(message, cause); }

    public HashAlgorithmCanNotRegistryException(Throwable cause) { super(cause); }

    public HashAlgorithmCanNotRegistryException(String message) { super(message); }

    public HashAlgorithmCanNotRegistryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
