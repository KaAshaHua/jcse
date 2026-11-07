package com.jcse.exception.format;

public class FormatWriteException extends FormatException {
    private static final long serialVersionUID = 1L;

    public FormatWriteException() {}

    public FormatWriteException(String message) { super(message); }

    public FormatWriteException(String message, Throwable cause) { super(message, cause); }

    public FormatWriteException(Throwable cause) { super(cause); }

    public FormatWriteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
