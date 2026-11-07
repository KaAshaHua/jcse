package com.jcse.exception.graphic.camera;

public class InvalidProjectionException extends CameraException {
    private static final long serialVersionUID = 1L;

    public InvalidProjectionException() {}

    public InvalidProjectionException(String message) { super(message); }

    public InvalidProjectionException(String message, Throwable cause) { super(message, cause); }

    public InvalidProjectionException(Throwable cause) { super(cause); }

    public InvalidProjectionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
