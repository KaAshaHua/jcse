package com.jcse.exception.graphic.texture;

public class UnsupportedTextureFormatException extends TextureException {
    private static final long serialVersionUID = 1L;

    public UnsupportedTextureFormatException() {}

    public UnsupportedTextureFormatException(String message) { super(message); }

    public UnsupportedTextureFormatException(String message, Throwable cause) { super(message, cause); }

    public UnsupportedTextureFormatException(Throwable cause) { super(cause); }

    public UnsupportedTextureFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
