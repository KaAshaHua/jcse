package com.jcse.exception.config;

public class ConfigFileNotFoundException extends ConfigException {
    private static final long serialVersionUID = 1L;

    public ConfigFileNotFoundException() {}

    public ConfigFileNotFoundException(String message) { super(message); }

    public ConfigFileNotFoundException(String message, Throwable cause) { super(message, cause); }

    public ConfigFileNotFoundException(Throwable cause) { super(cause); }

    public ConfigFileNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
