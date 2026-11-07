package com.jcse.exception.graphic.batch;

public class BatchCapacityExceededException extends BatchException {
    private static final long serialVersionUID = 1L;

    public BatchCapacityExceededException() {}

    public BatchCapacityExceededException(String message) { super(message); }

    public BatchCapacityExceededException(String message, Throwable cause) { super(message, cause); }

    public BatchCapacityExceededException(Throwable cause) { super(cause); }

    public BatchCapacityExceededException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
