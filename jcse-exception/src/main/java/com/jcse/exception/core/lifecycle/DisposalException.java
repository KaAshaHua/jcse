package com.jcse.exception.core.lifecycle;

public class DisposalException extends LifecycleException {
    private static final long serialVersionUID = 1L;

    public DisposalException() {}

    public DisposalException(String message) { super(message); }

    public DisposalException(String message, Throwable cause) { super(message, cause); }

    public DisposalException(Throwable cause) { super(cause); }

    public DisposalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
