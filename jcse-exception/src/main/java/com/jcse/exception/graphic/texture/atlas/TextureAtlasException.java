package com.jcse.exception.graphic.texture.atlas;

import com.jcse.exception.graphic.texture.TextureException;

public class TextureAtlasException extends TextureException {
    private static final long serialVersionUID = 1L;

    public TextureAtlasException() {}

    public TextureAtlasException(String message) { super(message); }

    public TextureAtlasException(String message, Throwable cause) { super(message, cause); }

    public TextureAtlasException(Throwable cause) { super(cause); }

    public TextureAtlasException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
