package com.jcse.exception.event;

public class ControllerDisconnectedException extends InputDeviceException {
    private static final long serialVersionUID = 1L;

    public ControllerDisconnectedException() {}

    public ControllerDisconnectedException(String message, Throwable cause) { super(message, cause); }

    public ControllerDisconnectedException(Throwable cause) { super(cause); }

    public ControllerDisconnectedException(String message) { super(message); }

    public ControllerDisconnectedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
