package com.jcse.exception.core;

import com.jcse.exception.JcseException;

public class CoreException extends JcseException {
    private static final long serialVersionUID = 1L;

    public CoreException() {}

    public CoreException(String message) { super(message); }

    public CoreException(String message, Throwable cause) { super(message, cause); }

    public CoreException(Throwable cause) { super(cause); }

    public CoreException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
