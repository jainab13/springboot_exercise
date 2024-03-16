package com.natwest.service;

import com.natwest.entity.LoanApplication;
import com.natwest.exception.LoanApplicationAlreadyExistException;
import com.natwest.exception.LoanApplicationNotFoundException;

public interface LoanApplicationService {
    LoanApplication saveLoanApplication(LoanApplication loanApplication) throws LoanApplicationAlreadyExistException;
    LoanApplication approveLoanApplication(int loanId) throws LoanApplicationNotFoundException;
    LoanApplication rejectLoanApplication(int loanId) throws LoanApplicationNotFoundException;
}
