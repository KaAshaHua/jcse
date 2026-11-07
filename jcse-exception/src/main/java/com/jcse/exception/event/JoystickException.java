package com.jcse.exception.event;

public class JoystickException extends InputDeviceException {
    private static final long serialVersionUID = 1L;

    public JoystickException() {}

    public JoystickException(String message, Throwable cause) { super(message, cause); }

    public JoystickException(Throwable cause) { super(cause); }

    public JoystickException(String message) { super(message); }

    public JoystickException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
