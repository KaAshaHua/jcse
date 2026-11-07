package com.jcse.exception.graphic.shader;

public class ShaderValidationException extends ShaderException {
    private static final long serialVersionUID = 1L;

    public ShaderValidationException() {}

    public ShaderValidationException(String message) { super(message); }

    public ShaderValidationException(String message, Throwable cause) { super(message, cause); }

    public ShaderValidationException(Throwable cause) { super(cause); }

    public ShaderValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
