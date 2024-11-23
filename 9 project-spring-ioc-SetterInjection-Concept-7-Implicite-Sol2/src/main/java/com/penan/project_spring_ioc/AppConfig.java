package com.penan.project_spring_ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
        loanAccount.setName("Penan10");
        return loanAccount;
    }

    @Bean
    @Primary
    public LoanAccount loanAccount1() {
        LoanAccount loanAccount = new LoanAccount();
        loanAccount.setId(11);
        loanAccount.setName("Penan11");
        return loanAccount;
    }

    // Explicitely assigning LoanAccount bean for below Account Bean
    @Bean
    public Account account() {
        Account acc = new Account();

        return acc;
    }
}
