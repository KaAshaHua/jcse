package com.jcse.exception.security;

public class InvalidCryptoKeyException extends JcesSecurityException {
    private static final long serialVersionUID = 1L;

    public InvalidCryptoKeyException() {}

    public InvalidCryptoKeyException(String message, Throwable cause) { super(message, cause); }

    public InvalidCryptoKeyException(Throwable cause) { super(cause); }

    public InvalidCryptoKeyException(String message) { super(message); }

    public InvalidCryptoKeyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
