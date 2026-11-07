package com.jcse.exception.graphic;

import com.jcse.exception.JcseException;

public class GraphicException extends JcseException {
    private static final long serialVersionUID = 1L;

    public GraphicException() {}

    public GraphicException(String message, Throwable cause) { super(message, cause); }

    public GraphicException(Throwable cause) { super(cause); }

    public GraphicException(String message) { super(message); }

    public GraphicException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { 
        super(message, cause, enableSuppression, writableStackTrace); 
    }
}
