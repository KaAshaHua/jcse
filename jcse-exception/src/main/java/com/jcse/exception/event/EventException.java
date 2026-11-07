package com.jcse.exception.event;

import com.jcse.exception.JcseException;

public class EventException extends JcseException {
    private static final long serialVersionUID = 1L;

    public EventException() {}

    public EventException(String message, Throwable cause) { super(message, cause); }

    public EventException(Throwable cause) { super(cause); }

    public EventException(String message) { super(message); }

    public EventException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
