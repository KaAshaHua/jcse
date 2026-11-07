package com.jcse.exception.graphic.buffer;

public class BufferCapacityExceededException extends BufferException {
    private static final long serialVersionUID = 1L;

    public BufferCapacityExceededException() {}

    public BufferCapacityExceededException(String message) { super(message); }

    public BufferCapacityExceededException(String message, Throwable cause) { super(message, cause); }

    public BufferCapacityExceededException(Throwable cause) { super(cause); }

    public BufferCapacityExceededException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
