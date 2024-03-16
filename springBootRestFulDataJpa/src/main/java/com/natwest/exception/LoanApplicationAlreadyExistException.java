package com.natwest.exception;

public class LoanApplicationAlreadyExistException extends Exception{
    public LoanApplicationAlreadyExistException(String message){
        super(message);
    }
}
