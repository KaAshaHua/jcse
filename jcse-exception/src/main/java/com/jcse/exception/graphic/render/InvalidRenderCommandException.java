package com.jcse.exception.graphic.render;

public class InvalidRenderCommandException extends RendererException {
    private static final long serialVersionUID = 1L;

    public InvalidRenderCommandException() {}

    public InvalidRenderCommandException(String message) { super(message); }

    public InvalidRenderCommandException(String message, Throwable cause) { super(message, cause); }

    public InvalidRenderCommandException(Throwable cause) { super(cause); }

    public InvalidRenderCommandException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
