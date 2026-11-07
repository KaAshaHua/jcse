package com.jcse.exception.graphic.sprite;

public class SpriteFrameException extends SpriteException {
    private static final long serialVersionUID = 1L;

    public SpriteFrameException() {}

    public SpriteFrameException(String message) { super(message); }

    public SpriteFrameException(String message, Throwable cause) { super(message, cause); }

    public SpriteFrameException(Throwable cause) { super(cause); }

    public SpriteFrameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
