package com.jcse.exception.tree;

import com.jcse.exception.JcseException;

public class TreeException extends JcseException {
    private static final long serialVersionUID = 1L;

    public TreeException() {}

    public TreeException(String message, Throwable cause) { super(message, cause); }

    public TreeException(Throwable cause) { super(cause); }

    public TreeException(String message) { super(message); }

    public TreeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
