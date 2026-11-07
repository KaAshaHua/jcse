package com.jcse.exception.graphic.shader;

public class ShaderLinkException extends ShaderException {
    private static final long serialVersionUID = 1L;

    public ShaderLinkException() {}

    public ShaderLinkException(String message) { super(message); }

    public ShaderLinkException(String message, Throwable cause) { super(message, cause); }

    public ShaderLinkException(Throwable cause) { super(cause); }

    public ShaderLinkException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
