package com.penan.project_spring_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Account {

    @Autowired
    @Qualifier("loanAccount") // Specify the bean name to inject
    LoanAccount loan;

    public LoanAccount getLoan() {
        return loan;
    }

    public void setLoan(LoanAccount loan) {
        this.loan = loan;
    }

}
