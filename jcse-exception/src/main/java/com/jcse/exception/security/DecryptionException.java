package com.jcse.exception.security;

public class DecryptionException extends JcesSecurityException {
    private static final long serialVersionUID = 1L;

    public DecryptionException() {}

    public DecryptionException(String message, Throwable cause) { super(message, cause); }

    public DecryptionException(Throwable cause) { super(cause); }

    public DecryptionException(String message) { super(message); }

    public DecryptionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
