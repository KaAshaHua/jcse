package com.jcse.exception.graphic.texture;

public class TextureSizeException extends TextureException {
    private static final long serialVersionUID = 1L;

    public TextureSizeException() {}

    public TextureSizeException(String message) { super(message); }

    public TextureSizeException(String message, Throwable cause) { super(message, cause); }

    public TextureSizeException(Throwable cause) { super(cause); }

    public TextureSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
