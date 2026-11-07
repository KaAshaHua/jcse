package com.jcse.exception.format.yaml;

import com.jcse.exception.format.FormatException;

public class YamlFormatException extends FormatException {
    private static final long serialVersionUID = 1L;

    public YamlFormatException() {}

    public YamlFormatException(String message) { super(message); }

    public YamlFormatException(String message, Throwable cause) { super(message, cause); }

    public YamlFormatException(Throwable cause) { super(cause); }

    public YamlFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
