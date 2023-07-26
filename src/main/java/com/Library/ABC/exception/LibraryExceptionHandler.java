package com.Library.ABC.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LibraryExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<Object> handleLibraryException(LibraryException libraryException){
        LibraryExceptionDetails libraryExceptionDetails=new LibraryExceptionDetails(libraryException.getMessage(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(libraryExceptionDetails,HttpStatus.NOT_FOUND);
    }
}
