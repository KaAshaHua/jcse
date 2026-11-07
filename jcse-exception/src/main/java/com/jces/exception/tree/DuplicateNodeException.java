package com.jces.exception.tree;

public class DuplicateNodeException extends TreeException {
    private static final long serialVersionUID = 1L;

    public DuplicateNodeException() {}

    public DuplicateNodeException(String message, Throwable cause) { super(message, cause); }

    public DuplicateNodeException(Throwable cause) { super(cause); }

    public DuplicateNodeException(String message) { super(message); }

    public DuplicateNodeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
