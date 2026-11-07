package com.jcse.exception.graphic.buffer;

public class BufferStateException extends BufferException {
    private static final long serialVersionUID = 1L;

    public BufferStateException() {}

    public BufferStateException(String message) { super(message); }

    public BufferStateException(String message, Throwable cause) { super(message, cause); }

    public BufferStateException(Throwable cause) { super(cause); }

    public BufferStateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
