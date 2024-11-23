package com.penan.project_spring_ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public LoanAccount loanAccount12() {
        LoanAccount loanAccount = new LoanAccount();
        loanAccount.setId(12);
        loanAccount.setName("Penan12");
        return loanAccount;
    }

    // Implicite assigning LoanAccount bean for below Account Bean by Com
    @Bean
    public Account account() {
        Account acc = new Account();
        // acc.setLoan(loanAccount12()); 
           return acc;
    }
}
