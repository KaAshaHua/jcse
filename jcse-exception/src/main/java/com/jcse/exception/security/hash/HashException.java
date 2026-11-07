package com.jcse.exception.security.hash;

import com.jcse.exception.security.JcesSecurityException;

public class HashException extends JcesSecurityException {
    private static final long serialVersionUID = 1L;

    public HashException() {}

    public HashException(String message, Throwable cause) { super(message, cause); }

    public HashException(Throwable cause) { super(cause); }

    public HashException(String message) { super(message); }

    public HashException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
