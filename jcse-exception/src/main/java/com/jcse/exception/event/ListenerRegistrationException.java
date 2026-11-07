package com.jcse.exception.event;

public class ListenerRegistrationException extends ListenerException {
    private static final long serialVersionUID = 1L;

    public ListenerRegistrationException() {}

    public ListenerRegistrationException(String message, Throwable cause) { super(message, cause); }

    public ListenerRegistrationException(Throwable cause) { super(cause); }

    public ListenerRegistrationException(String message) { super(message); }

    public ListenerRegistrationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
