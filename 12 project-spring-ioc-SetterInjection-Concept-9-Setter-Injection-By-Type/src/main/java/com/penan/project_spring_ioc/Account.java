package com.penan.project_spring_ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class Account {

    LoanAccount loan;

    public LoanAccount getLoan() {
        return loan;
    }

    @Autowired
    public void setLoan(LoanAccount loan) {
        this.loan = loan;
    }
}
