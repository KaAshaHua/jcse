package com.jcse.exception.graphic.render;

import com.jcse.exception.graphic.GraphicException;

public class RendererException extends GraphicException {
    private static final long serialVersionUID = 1L;

    public RendererException() {}

    public RendererException(String message) { super(message); }

    public RendererException(String message, Throwable cause) { super(message, cause); }

    public RendererException(Throwable cause) { super(cause); }

    public RendererException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
