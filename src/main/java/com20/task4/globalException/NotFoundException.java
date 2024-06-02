package com20.task4.globalException;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}