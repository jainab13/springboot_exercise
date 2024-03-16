package com.natwest.exception;

public class LoanApplicationNotFoundException extends Exception{
    public LoanApplicationNotFoundException(String message){
        super(message);
    }
}
