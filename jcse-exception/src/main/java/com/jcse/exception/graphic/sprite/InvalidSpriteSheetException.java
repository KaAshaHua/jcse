package com.jcse.exception.graphic.sprite;

public class InvalidSpriteSheetException extends SpriteException {
    private static final long serialVersionUID = 1L;

    public InvalidSpriteSheetException() {}

    public InvalidSpriteSheetException(String message) { super(message); }

    public InvalidSpriteSheetException(String message, Throwable cause) { super(message, cause); }

    public InvalidSpriteSheetException(Throwable cause) { super(cause); }

    public InvalidSpriteSheetException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
