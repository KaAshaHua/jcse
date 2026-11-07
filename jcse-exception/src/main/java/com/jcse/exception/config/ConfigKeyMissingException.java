package com.jcse.exception.config;

public class ConfigKeyMissingException extends ConfigException {
    private static final long serialVersionUID = 1L;

    public ConfigKeyMissingException() {}

    public ConfigKeyMissingException(String message) { super(message); }

    public ConfigKeyMissingException(String message, Throwable cause) { super(message, cause); }

    public ConfigKeyMissingException(Throwable cause) { super(cause); }

    public ConfigKeyMissingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
