package com.jcse.exception.format.xml;

import com.jcse.exception.format.FormatException;

public class XmlFormatException extends FormatException {
    private static final long serialVersionUID = 1L;

    public XmlFormatException() {}

    public XmlFormatException(String message) { super(message); }

    public XmlFormatException(String message, Throwable cause) { super(message, cause); }

    public XmlFormatException(Throwable cause) { super(cause); }

    public XmlFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
