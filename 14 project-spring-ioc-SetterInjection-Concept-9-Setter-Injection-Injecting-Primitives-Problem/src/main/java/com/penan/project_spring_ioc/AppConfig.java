package com.penan.project_spring_ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Below gives error at Object Creation
    // Error creating bean with name 'account': 
    // Unsatisfied dependency expressed through field 'accName': 
    // No qualifying bean of type 'java.lang.String' available: 
    // expected at least 1 bean which qualifies as autowire candidate.
    @Bean
    public Account account() {
        Account acc = new Account();
        return acc;
    }
}
