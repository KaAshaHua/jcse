package com.jcse.exception.graphic.shader;

public class ShaderLoadException extends ShaderException {
    private static final long serialVersionUID = 1L;

    public ShaderLoadException() {}

    public ShaderLoadException(String message) { super(message); }

    public ShaderLoadException(String message, Throwable cause) { super(message, cause); }

    public ShaderLoadException(Throwable cause) { super(cause); }

    public ShaderLoadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
