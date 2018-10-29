package com.masha.myFirstTestProject.customExceptions.exceptions;

public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String message) {
        super(message);
    }

    public MyRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
