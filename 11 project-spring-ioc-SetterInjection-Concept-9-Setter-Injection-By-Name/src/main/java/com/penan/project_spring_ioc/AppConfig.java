package com.penan.project_spring_ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public LoanAccount loanAccount2() {
        LoanAccount loanAccount = new LoanAccount();
        loanAccount.setId(12);
        loanAccount.setName("Penan12");
        return loanAccount;
    }

    @Bean
    public Account account() {
        Account acc = new Account();
        acc.setLoan(loanAccount2());
        return acc;
    }
}
