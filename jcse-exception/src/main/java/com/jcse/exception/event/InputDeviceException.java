package com.jcse.exception.event;

public class InputDeviceException extends EventException {
    private static final long serialVersionUID = 1L;

    public InputDeviceException() {}

    public InputDeviceException(String message, Throwable cause) { super(message, cause); }

    public InputDeviceException(Throwable cause) { super(cause); }

    public InputDeviceException(String message) { super(message); }

    public InputDeviceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
