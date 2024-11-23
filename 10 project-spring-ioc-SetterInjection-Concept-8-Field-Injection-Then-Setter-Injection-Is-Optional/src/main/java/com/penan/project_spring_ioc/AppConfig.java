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

    // Explicitely assigning LoanAccount bean for below Account Bean
    @Bean
    public Account account() {
        Account acc = new Account();

        return acc;
    }
}
