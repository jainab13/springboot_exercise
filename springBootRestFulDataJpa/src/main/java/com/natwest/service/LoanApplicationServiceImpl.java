package com.natwest.service;

import com.natwest.entity.LoanApplication;
import com.natwest.exception.LoanApplicationAlreadyExistException;
import com.natwest.exception.LoanApplicationNotFoundException;
import com.natwest.repository.LoanApplicationRepository;
import com.natwest.utility.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoanApplicationServiceImpl implements LoanApplicationService{

    @Autowired
    LoanApplicationRepository loanApplicationRepository;

    @Override
    public LoanApplication saveLoanApplication(LoanApplication loanApplication) throws LoanApplicationAlreadyExistException {

        if(loanApplicationRepository.existsById(loanApplication.getId())){
            throw new LoanApplicationAlreadyExistException(AppConstant.LOAN_APPLICATION_ALREADY_EXISTS);
        }
        else{
            return loanApplicationRepository.save(loanApplication);
        }
    }

    @Override
    public LoanApplication approveLoanApplication(int loanId) throws LoanApplicationNotFoundException {
        Optional<LoanApplication> loanApplicationOptional = loanApplicationRepository.findById(loanId);

        if(loanApplicationOptional.isPresent()){
            LoanApplication loanApplication = loanApplicationOptional.get();
            loanApplication.setStatus("Approved");
            return loanApplicationRepository.save(loanApplication);
        }
        else{
            throw new LoanApplicationNotFoundException(AppConstant.LOAN_Application_NOT_FOUND);
        }
    }

    @Override
    public LoanApplication rejectLoanApplication(int loanId) throws LoanApplicationNotFoundException {
        Optional<LoanApplication> loanApplicationOptional = loanApplicationRepository.findById(loanId);

        if(loanApplicationOptional.isPresent()){
            LoanApplication loanApplication = loanApplicationOptional.get();
            loanApplication.setStatus("rejected");
            return loanApplicationRepository.save(loanApplication);
        }
        else{
            throw new LoanApplicationNotFoundException(AppConstant.LOAN_Application_NOT_FOUND);
        }
    }
}
