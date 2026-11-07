package com.jcse.exception.config;

import com.jcse.exception.JcseException;

public class ConfigException extends JcseException {
    private static final long serialVersionUID = 1L;

    public ConfigException() {}

    public ConfigException(String message) { super(message); }

    public ConfigException(String message, Throwable cause) { super(message, cause); }

    public ConfigException(Throwable cause) { super(cause); }

    public ConfigException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
