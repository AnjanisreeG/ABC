package com.Library.ABC.exception;

import org.springframework.http.HttpStatus;

public class LibraryExceptionDetails {
    private final String message;
    private final HttpStatus httpStatus;

    public LibraryExceptionDetails(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
