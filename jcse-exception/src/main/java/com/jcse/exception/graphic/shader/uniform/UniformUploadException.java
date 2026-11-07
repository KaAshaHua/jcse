package com.jcse.exception.graphic.shader.uniform;

public class UniformUploadException extends UniformException {
    private static final long serialVersionUID = 1L;

    public UniformUploadException() {}

    public UniformUploadException(String message) { super(message); }

    public UniformUploadException(String message, Throwable cause) { super(message, cause); }

    public UniformUploadException(Throwable cause) { super(cause); }

    public UniformUploadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
