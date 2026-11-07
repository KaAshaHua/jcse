package com.jcse.exception.format;

import com.jcse.exception.JcseException;

public class FormatException extends JcseException {
    private static final long serialVersionUID = 1L;

    public FormatException() {}

    public FormatException(String message) { super(message); }

    public FormatException(String message, Throwable cause) { super(message, cause); }

    public FormatException(Throwable cause) { super(cause); }

    public FormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
