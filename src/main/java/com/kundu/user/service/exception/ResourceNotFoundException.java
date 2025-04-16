package com.kundu.user.service.exception;

public class ResourceNotFoundException extends RuntimeException{

    //Constructor
    public ResourceNotFoundException() {
        super("Resource Not found Exception!!");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

}
