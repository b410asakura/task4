package com20.task4.globalException;

public class AccessDeniedException extends RuntimeException{
    public AccessDeniedException(String message) {
        super(message);
    }
}
