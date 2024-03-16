package com.natwest.controller;

import com.natwest.entity.LoanApplication;
import com.natwest.exception.LoanApplicationAlreadyExistException;
import com.natwest.exception.LoanApplicationNotFoundException;
import com.natwest.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class LoanApplicationController {
    @Autowired
    LoanApplicationService loanApplicationService;

    @PostMapping("applyLoan/")
    public ResponseEntity<LoanApplication> applyLoan(@RequestBody LoanApplication loanApplication) throws LoanApplicationAlreadyExistException {
        return new ResponseEntity<>(loanApplicationService.saveLoanApplication(loanApplication), HttpStatus.OK);
    }

    @PutMapping("approveLoan/{id}")
    public ResponseEntity<LoanApplication> approveLoan(@RequestParam int id) throws LoanApplicationNotFoundException {
        return new ResponseEntity<>(loanApplicationService.approveLoanApplication(id), HttpStatus.OK);
    }

    @DeleteMapping("rejectLoan/{id}")
    public ResponseEntity<LoanApplication> rejectLoan(@RequestParam int id) throws LoanApplicationNotFoundException {
        return new ResponseEntity<>(loanApplicationService.rejectLoanApplication(id), HttpStatus.OK);
    }




}






