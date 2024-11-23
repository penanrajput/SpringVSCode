package com.penan.project_spring_ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public Customer customer() {
        Customer cust = new Customer();
        cust.setId(50);
        cust.setName("Penan");
        return cust;
    }

    @Bean
    public LoanAccount loanAccount() {
        LoanAccount loanAccount = new LoanAccount();
        loanAccount.setId(10);
        loanAccount.setName("Penan");
        return loanAccount;
    }
}
