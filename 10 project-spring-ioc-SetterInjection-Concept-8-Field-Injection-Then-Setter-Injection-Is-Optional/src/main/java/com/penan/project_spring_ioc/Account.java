package com.penan.project_spring_ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class Account {

    // Field Injection
    // works even if we comment setLoan () / Setter Injection  (see below)
    @Autowired
    LoanAccount loan; // Field Injection

    public LoanAccount getLoan() {
        return loan;
    }

    // commented below code
    // public void setLoan(LoanAccount loan) {
    //     this.loan = loan;
    // }
}
