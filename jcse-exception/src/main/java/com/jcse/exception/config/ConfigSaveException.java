package com.jcse.exception.config;

public class ConfigSaveException extends ConfigException {
    private static final long serialVersionUID = 1L;

    public ConfigSaveException() {}

    public ConfigSaveException(String message) { super(message); }

    public ConfigSaveException(String message, Throwable cause) { super(message, cause); }

    public ConfigSaveException(Throwable cause) { super(cause); }

    public ConfigSaveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
