package com.jcse.exception.core.lifecycle;

import com.jcse.exception.core.CoreException;

public class LifecycleException extends CoreException {
    private static final long serialVersionUID = 1L;

    public LifecycleException() {}

    public LifecycleException(String message) { super(message); }

    public LifecycleException(String message, Throwable cause) { super(message, cause); }

    public LifecycleException(Throwable cause) { super(cause); }

    public LifecycleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
