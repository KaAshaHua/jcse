package com.jcse.exception.tree;

public class ChildLimitExceededException extends TreeException {
    private static final long serialVersionUID = 1L;

    public ChildLimitExceededException() {}

    public ChildLimitExceededException(String message, Throwable cause) { super(message, cause); }

    public ChildLimitExceededException(Throwable cause) { super(cause); }

    public ChildLimitExceededException(String message) { super(message); }

    public ChildLimitExceededException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
