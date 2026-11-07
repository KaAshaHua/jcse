package com.jcse.exception.graphic.sprite;

public class SpriteAnimationException extends SpriteException {
    private static final long serialVersionUID = 1L;

    public SpriteAnimationException() {}

    public SpriteAnimationException(String message) { super(message); }

    public SpriteAnimationException(String message, Throwable cause) { super(message, cause); }

    public SpriteAnimationException(Throwable cause) { super(cause); }

    public SpriteAnimationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
