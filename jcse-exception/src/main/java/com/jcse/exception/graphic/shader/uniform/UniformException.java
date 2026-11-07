package com.jcse.exception.graphic.shader.uniform;

import com.jcse.exception.graphic.shader.ShaderException;

public class UniformException extends ShaderException {
    private static final long serialVersionUID = 1L;

    public UniformException() {}

    public UniformException(String message) { super(message); }

    public UniformException(String message, Throwable cause) { super(message, cause); }

    public UniformException(Throwable cause) { super(cause); }

    public UniformException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
