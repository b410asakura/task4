package com20.task4.globalException;

public class BadCredentialException extends RuntimeException {
    public BadCredentialException(String message) {
        super(message);
    }
}
