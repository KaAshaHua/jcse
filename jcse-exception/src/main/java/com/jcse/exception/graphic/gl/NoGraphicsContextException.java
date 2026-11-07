package com.jcse.exception.graphic.gl;

public class NoGraphicsContextException extends OpenGLException {
    private static final long serialVersionUID = 1L;

    public NoGraphicsContextException() {}

    public NoGraphicsContextException(String message) { super(message); }

    public NoGraphicsContextException(String message, Throwable cause) { super(message, cause); }

    public NoGraphicsContextException(Throwable cause) { super(cause); }

    public NoGraphicsContextException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
