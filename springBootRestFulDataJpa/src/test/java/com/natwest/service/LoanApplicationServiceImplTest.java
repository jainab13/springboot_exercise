package com.natwest.service;

import com.natwest.entity.LoanApplication;
import com.natwest.exception.LoanApplicationAlreadyExistException;
import com.natwest.repository.LoanApplicationRepository;
import com.natwest.utility.AppConstant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class LoanApplicationServiceImplTest {
    @Mock
    LoanApplicationRepository loanApplicationRepository;
    @Mock
    LoanApplication loanApplication;

    @InjectMocks
    LoanApplicationServiceImpl loanApplicationServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveLoanApplication() throws LoanApplicationAlreadyExistException {
        when(loanApplicationRepository.save(loanApplication)).thenReturn(loanApplication);
        LoanApplication result =loanApplicationServiceImpl.saveLoanApplication(loanApplication);
        assertEquals(loanApplication,result);

    }

    @Test
    void approveLoanApplication() {

    }

    @Test
    void rejectLoanApplication() {
    }
}