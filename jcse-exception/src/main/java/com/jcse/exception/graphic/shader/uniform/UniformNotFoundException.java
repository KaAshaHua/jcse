package com.jcse.exception.graphic.shader.uniform;

public class UniformNotFoundException extends UniformException {
    private static final long serialVersionUID = 1L;

    public UniformNotFoundException() {}

    public UniformNotFoundException(String message) { super(message); }

    public UniformNotFoundException(String message, Throwable cause) { super(message, cause); }

    public UniformNotFoundException(Throwable cause) { super(cause); }

    public UniformNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
