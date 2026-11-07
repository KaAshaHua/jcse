package com.jcse.exception.graphic.gl;

import com.jcse.exception.graphic.GraphicException;

public class OpenGLException extends GraphicException {
    private static final long serialVersionUID = 1L;

    public OpenGLException() {}

    public OpenGLException(String message) { super(message); }

    public OpenGLException(String message, Throwable cause) { super(message, cause); }

    public OpenGLException(Throwable cause) { super(cause); }

    public OpenGLException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
