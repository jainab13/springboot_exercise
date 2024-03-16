package com.natwest.controllerAdvice;

import com.natwest.exception.LoanApplicationAlreadyExistException;
import com.natwest.exception.LoanApplicationNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(LoanApplicationAlreadyExistException.class)
    public ResponseEntity<ErrorInfo> handleExceptionForBalance(LoanApplicationAlreadyExistException alreadyExistException){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpStatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(alreadyExistException.getMessage());
        errorInfo.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(LoanApplicationNotFoundException.class)
    public ResponseEntity<ErrorInfo> handleExceptionForBalance(LoanApplicationNotFoundException applicationNotFoundException){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpStatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(applicationNotFoundException.getMessage());
        errorInfo.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }

}
