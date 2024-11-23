package com.penan.project_spring_ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

    private int id;
    private String name;

    @Autowired
    private LoanAccount loanAccount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoanAccount getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(LoanAccount loanAccount) {
        this.loanAccount = loanAccount;
    }

}
