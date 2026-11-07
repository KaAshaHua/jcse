package com.jcse.exception.graphic.gl;

public class UnsupportedGLVersionException extends OpenGLException {
    private static final long serialVersionUID = 1L;

    public UnsupportedGLVersionException() {}

    public UnsupportedGLVersionException(String message) { super(message); }

    public UnsupportedGLVersionException(String message, Throwable cause) { super(message, cause); }

    public UnsupportedGLVersionException(Throwable cause) { super(cause); }

    public UnsupportedGLVersionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
