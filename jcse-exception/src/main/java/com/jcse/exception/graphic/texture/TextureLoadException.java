package com.jcse.exception.graphic.texture;

public class TextureLoadException extends TextureException {
    private static final long serialVersionUID = 1L;

    public TextureLoadException() {}

    public TextureLoadException(String message) { super(message); }

    public TextureLoadException(String message, Throwable cause) { super(message, cause); }

    public TextureLoadException(Throwable cause) { super(cause); }

    public TextureLoadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
