package com.okayjava.html.exception;

public class TodoCollectionException extends Exception {

    public TodoCollectionException(String message) {
        super(message);
    }

    public static String NotFoundException(String id) {
        return "Todo with " + id + " Not Found";
    }

    public static String TodoAlreadyExists() {
        return "Todo with the given name already exists";
    }
}
