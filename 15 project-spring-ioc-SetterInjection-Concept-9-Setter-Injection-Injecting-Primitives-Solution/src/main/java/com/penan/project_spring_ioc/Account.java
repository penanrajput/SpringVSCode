package com.penan.project_spring_ioc;

import org.springframework.beans.factory.annotation.Value;

public class Account {

    private int accId;

    @Value("Chetan") // Default Value, 
    // "Chetan" even if you explicitely using setter method 
    // i.e. setAccName() method
    private String accName;

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        // this.accName = accName;

        if (accName == null || accName.trim().isEmpty()) {
            throw new IllegalArgumentException("accName must not be null or empty");
        }
        this.accName = accName;
    }

    @Override
    public String toString() {
        return "Account [accId=" + accId + ", accName=" + accName + "]";
    }

}
