package com.penan.project_spring_ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class Account {

    @Autowired
    LoanAccount loan;

    public LoanAccount getLoan() {
        return loan;
    }

    public void setLoan(LoanAccount loan) {
        this.loan = loan;
    }

}
