package com.inyong.section05.userexception;

public class IncorrectAgeException extends RuntimeException{
    public IncorrectAgeException(){}

    public IncorrectAgeException(String message) {
        super(message);
    }

}
