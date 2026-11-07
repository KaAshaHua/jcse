package com.jcse.exception.graphic.batch;

public class BatchAlreadyStartedException extends BatchException {
    private static final long serialVersionUID = 1L;

    public BatchAlreadyStartedException() {}

    public BatchAlreadyStartedException(String message) { super(message); }

    public BatchAlreadyStartedException(String message, Throwable cause) { super(message, cause); }

    public BatchAlreadyStartedException(Throwable cause) { super(cause); }

    public BatchAlreadyStartedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
