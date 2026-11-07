package com.jcse.exception.config;

public class ConfigValueException extends ConfigException {
    private static final long serialVersionUID = 1L;

    public ConfigValueException() {}

    public ConfigValueException(String message) { super(message); }

    public ConfigValueException(String message, Throwable cause) { super(message, cause); }

    public ConfigValueException(Throwable cause) { super(cause); }

    public ConfigValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
