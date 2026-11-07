package com.jcse.exception.graphic.batch;

public class BatchNotStartedException extends BatchException {
    private static final long serialVersionUID = 1L;

    public BatchNotStartedException() {}

    public BatchNotStartedException(String message) { super(message); }

    public BatchNotStartedException(String message, Throwable cause) { super(message, cause); }

    public BatchNotStartedException(Throwable cause) { super(cause); }

    public BatchNotStartedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
