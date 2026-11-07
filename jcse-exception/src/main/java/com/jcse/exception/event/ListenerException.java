package com.jcse.exception.event;

public class ListenerException extends EventException {
    private static final long serialVersionUID = 1L;

    public ListenerException() {}

    public ListenerException(String message, Throwable cause) { super(message, cause); }

    public ListenerException(Throwable cause) { super(cause); }

    public ListenerException(String message) { super(message); }

    public ListenerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
