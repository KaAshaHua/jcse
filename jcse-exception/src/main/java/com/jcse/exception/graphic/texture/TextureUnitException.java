package com.jcse.exception.graphic.texture;

public class TextureUnitException extends TextureException {
    private static final long serialVersionUID = 1L;

    public TextureUnitException() {}

    public TextureUnitException(String message) { super(message); }

    public TextureUnitException(String message, Throwable cause) { super(message, cause); }

    public TextureUnitException(Throwable cause) { super(cause); }

    public TextureUnitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
