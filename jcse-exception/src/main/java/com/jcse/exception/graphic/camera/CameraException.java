package com.jcse.exception.graphic.camera;

import com.jcse.exception.graphic.GraphicException;

public class CameraException extends GraphicException {
    private static final long serialVersionUID = 1L;

    public CameraException() {}

    public CameraException(String message) { super(message); }

    public CameraException(String message, Throwable cause) { super(message, cause); }

    public CameraException(Throwable cause) { super(cause); }

    public CameraException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
