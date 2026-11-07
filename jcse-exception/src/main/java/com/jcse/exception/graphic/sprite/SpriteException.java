package com.jcse.exception.graphic.sprite;

import com.jcse.exception.graphic.GraphicException;

public class SpriteException extends GraphicException {
    private static final long serialVersionUID = 1L;

    public SpriteException() {}

    public SpriteException(String message) { super(message); }

    public SpriteException(String message, Throwable cause) { super(message, cause); }

    public SpriteException(Throwable cause) { super(cause); }

    public SpriteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
