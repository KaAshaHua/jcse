package com.jcse.exception.graphic.batch;

import com.jcse.exception.graphic.GraphicException;

public class BatchException extends GraphicException {
    private static final long serialVersionUID = 1L;

    public BatchException() {}

    public BatchException(String message) { super(message); }

    public BatchException(String message, Throwable cause) { super(message, cause); }

    public BatchException(Throwable cause) { super(cause); }

    public BatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
