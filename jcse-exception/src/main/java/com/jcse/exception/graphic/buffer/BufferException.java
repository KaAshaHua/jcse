package com.jcse.exception.graphic.buffer;

import com.jcse.exception.graphic.GraphicException;

public class BufferException extends GraphicException {
    private static final long serialVersionUID = 1L;

    public BufferException() {}

    public BufferException(String message) { super(message); }

    public BufferException(String message, Throwable cause) { super(message, cause); }

    public BufferException(Throwable cause) { super(cause); }

    public BufferException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
