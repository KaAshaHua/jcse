package com.jcse.exception.config;

public class DuplicateConfigurationException extends ConfigException {
    private static final long serialVersionUID = 1L;

    public DuplicateConfigurationException() {}

    public DuplicateConfigurationException(String message) { super(message); }

    public DuplicateConfigurationException(String message, Throwable cause) { super(message, cause); }

    public DuplicateConfigurationException(Throwable cause) { super(cause); }

    public DuplicateConfigurationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
