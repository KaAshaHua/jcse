package com.jcse.exception.graphic.render;

public class RendererStateException extends RendererException {
    private static final long serialVersionUID = 1L;

    public RendererStateException() {}

    public RendererStateException(String message) { super(message); }

    public RendererStateException(String message, Throwable cause) { super(message, cause); }

    public RendererStateException(Throwable cause) { super(cause); }

    public RendererStateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
