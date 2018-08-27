package com.demo.demossm.exception;

public class InfoNotFullyException extends RuntimeException{
    private String message;

    public InfoNotFullyException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
