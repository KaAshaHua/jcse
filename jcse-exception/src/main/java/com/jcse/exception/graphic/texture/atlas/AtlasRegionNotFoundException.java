package com.jcse.exception.graphic.texture.atlas;

public class AtlasRegionNotFoundException extends TextureAtlasException {
    private static final long serialVersionUID = 1L;

    public AtlasRegionNotFoundException() {}

    public AtlasRegionNotFoundException(String message) { super(message); }

    public AtlasRegionNotFoundException(String message, Throwable cause) { super(message, cause); }

    public AtlasRegionNotFoundException(Throwable cause) { super(cause); }

    public AtlasRegionNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
