package com.penan.project_spring_ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Customer customer() {
        Customer cust = new Customer();
        cust.setId(50);
        cust.setName("Penan");
        cust.setLoanAccount(loanAccount());
        return cust;
    }

    @Bean
    public LoanAccount loanAccount() {
        LoanAccount loanAccount = new LoanAccount();
        loanAccount.setId(10);
        loanAccount.setName("Penan");
        return loanAccount;
    }

    @Bean
    public LoanAccount loanAccount1() {
        LoanAccount loanAccount = new LoanAccount();
        loanAccount.setId(10);
        loanAccount.setName("Penan");
        return loanAccount;
    }

    // Can't Implicitely assign loanAccount BEAN 
    // because there are two BEANS are avaialble 
    // so it will give error  
    // expected single matching bean but found 2: loanAccount,loanAccount1 
    @Bean
    public Account account() {
        Account acc = new Account();

        return acc;
    }
}
