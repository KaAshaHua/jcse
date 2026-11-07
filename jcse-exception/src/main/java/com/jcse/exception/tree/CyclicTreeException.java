package com.jcse.exception.tree;

public class CyclicTreeException extends TreeException {
    private static final long serialVersionUID = 1L;

    public CyclicTreeException() {}

    public CyclicTreeException(String message, Throwable cause) { super(message, cause); }

    public CyclicTreeException(Throwable cause) { super(cause); }

    public CyclicTreeException(String message) { super(message); }

    public CyclicTreeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
