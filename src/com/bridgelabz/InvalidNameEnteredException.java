package com.bridgelabz;

public class InvalidNameEnteredException extends Exception {
    String errorMessage;

    public InvalidNameEnteredException( String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}
