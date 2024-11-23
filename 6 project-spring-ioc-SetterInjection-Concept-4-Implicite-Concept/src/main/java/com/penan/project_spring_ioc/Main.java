package com.penan.project_spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // Output: Customer is instantiating

        Account acc = (Account) context.getBean("account");
        System.out.println("Account: " + acc);
        System.out.println("Account - LoanAccount: " + acc.getLoan());
        System.out.println("Account - LoanAccount: " + acc.getLoan().getId());
        System.out.println("Account - LoanAccount: " + acc.getLoan().getName());

    }
}
