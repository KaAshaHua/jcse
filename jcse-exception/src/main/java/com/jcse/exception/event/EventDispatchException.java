package com.jcse.exception.event;

public class EventDispatchException extends EventException {
    private static final long serialVersionUID = 1L;

    public EventDispatchException() {}

    public EventDispatchException(String message, Throwable cause) { super(message, cause); }

    public EventDispatchException(Throwable cause) { super(cause); }

    public EventDispatchException(String message) { super(message); }

    public EventDispatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
