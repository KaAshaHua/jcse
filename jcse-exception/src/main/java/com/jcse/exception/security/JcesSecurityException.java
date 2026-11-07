package com.jcse.exception.security;

import com.jcse.exception.JcseException;

public class JcesSecurityException extends JcseException {
    private static final long serialVersionUID = 1L;

    public JcesSecurityException() {}

    public JcesSecurityException(String message, Throwable cause) { super(message, cause); }

    public JcesSecurityException(Throwable cause) { super(cause); }

    public JcesSecurityException(String message) { super(message); }

    public JcesSecurityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
