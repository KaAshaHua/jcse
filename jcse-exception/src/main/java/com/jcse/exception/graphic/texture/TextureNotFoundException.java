package com.jcse.exception.graphic.texture;

public class TextureNotFoundException extends TextureException {
    private static final long serialVersionUID = 1L;

    public TextureNotFoundException() {}

    public TextureNotFoundException(String message) { super(message); }

    public TextureNotFoundException(String message, Throwable cause) { super(message, cause); }

    public TextureNotFoundException(Throwable cause) { super(cause); }

    public TextureNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
