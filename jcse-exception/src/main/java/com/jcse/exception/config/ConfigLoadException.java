package com.jcse.exception.config;

public class ConfigLoadException extends ConfigException {
    private static final long serialVersionUID = 1L;

    public ConfigLoadException() {}

    public ConfigLoadException(String message) { super(message); }

    public ConfigLoadException(String message, Throwable cause) { super(message, cause); }

    public ConfigLoadException(Throwable cause) { super(cause); }

    public ConfigLoadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
