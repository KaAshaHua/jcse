package com.jcse.exception.graphic.buffer;

public class VertexLayoutException extends BufferException {
    private static final long serialVersionUID = 1L;

    public VertexLayoutException() {}

    public VertexLayoutException(String message) { super(message); }

    public VertexLayoutException(String message, Throwable cause) { super(message, cause); }

    public VertexLayoutException(Throwable cause) { super(cause); }

    public VertexLayoutException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
