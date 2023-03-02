package org.example;

public class MoodAnalyserException extends RuntimeException{
    enum ExceptionType{NULL,EMPTY}
    ExceptionType Type;

    public MoodAnalyserException(ExceptionType type, String message) {
        super(message);
        this.Type = type;
    }
}
