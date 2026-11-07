package com.jcse.exception.config;

public class ConfigNotFoundException extends ConfigException {
    private static final long serialVersionUID = 1L;

    public ConfigNotFoundException() {}

    public ConfigNotFoundException(String message) { super(message); }

    public ConfigNotFoundException(String message, Throwable cause) { super(message, cause); }

    public ConfigNotFoundException(Throwable cause) { super(cause); }

    public ConfigNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
