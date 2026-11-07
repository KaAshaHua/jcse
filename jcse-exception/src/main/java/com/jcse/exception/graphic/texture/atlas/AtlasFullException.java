package com.jcse.exception.graphic.texture.atlas;

public class AtlasFullException extends TextureAtlasException {
    private static final long serialVersionUID = 1L;

    public AtlasFullException() {}

    public AtlasFullException(String message) { super(message); }

    public AtlasFullException(String message, Throwable cause) { super(message, cause); }

    public AtlasFullException(Throwable cause) { super(cause); }

    public AtlasFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
