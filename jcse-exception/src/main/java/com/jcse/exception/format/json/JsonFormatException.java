package com.jcse.exception.format.json;

import com.jcse.exception.format.FormatException;

public class JsonFormatException extends FormatException {
    private static final long serialVersionUID = 1L;

    public JsonFormatException() {}

    public JsonFormatException(String message) { super(message); }

    public JsonFormatException(String message, Throwable cause) { super(message, cause); }

    public JsonFormatException(Throwable cause) { super(cause); }

    public JsonFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
