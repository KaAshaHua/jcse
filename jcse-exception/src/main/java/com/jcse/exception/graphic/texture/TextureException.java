package com.jcse.exception.graphic.texture;

import com.jcse.exception.graphic.GraphicException;

public class TextureException extends GraphicException {
    private static final long serialVersionUID = 1L;

    public TextureException() {}

    public TextureException(String message) { super(message); }

    public TextureException(String message, Throwable cause) { super(message, cause); }

    public TextureException(Throwable cause) { super(cause); }

    public TextureException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
