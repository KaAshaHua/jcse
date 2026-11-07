package com.jcse.exception.graphic.shader;

public class ShaderCompileException extends ShaderException {
    private static final long serialVersionUID = 1L;

    public ShaderCompileException() {}

    public ShaderCompileException(String message) { super(message); }

    public ShaderCompileException(String message, Throwable cause) { super(message, cause); }

    public ShaderCompileException(Throwable cause) { super(cause); }

    public ShaderCompileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
