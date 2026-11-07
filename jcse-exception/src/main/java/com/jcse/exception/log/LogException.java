package com.jcse.exception.log;

import com.jcse.exception.JcseException;

public class LogException extends JcseException {
    private static final long serialVersionUID = 1L;

    public LogException() {}

    public LogException(String message) { super(message); }

    public LogException(String message, Throwable cause) { super(message, cause); }

    public LogException(Throwable cause) { super(cause); }

    public LogException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
