package com.grepp.exception.custom;


// Unchecked Exception : RuntimeException 상속
public class NotValidException extends RuntimeException{

    public NotValidException(String message) {
        super(message);
    }
}
