package com.mongocurd.mongocrudoperations.exceptionHandler;

public class DuplicateKeyException extends RuntimeException {
    
    public DuplicateKeyException(String message) {
        super(message);
    }
}
