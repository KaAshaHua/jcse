package com.jcse.exception.format;

public class FormatParseException extends FormatException {
    private static final long serialVersionUID = 1L;

    public FormatParseException() {}

    public FormatParseException(String message) { super(message); }

    public FormatParseException(String message, Throwable cause) { super(message, cause); }

    public FormatParseException(Throwable cause) { super(cause); }

    public FormatParseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
