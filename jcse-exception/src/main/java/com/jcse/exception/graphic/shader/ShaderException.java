package com.jcse.exception.graphic.shader;

import com.jcse.exception.graphic.GraphicException;

public class ShaderException extends GraphicException {
    private static final long serialVersionUID = 1L;

    public ShaderException() {}

    public ShaderException(String message) { super(message); }

    public ShaderException(String message, Throwable cause) { super(message, cause); }

    public ShaderException(Throwable cause) { super(cause); }

    public ShaderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
