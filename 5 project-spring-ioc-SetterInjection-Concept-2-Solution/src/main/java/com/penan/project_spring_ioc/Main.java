package com.penan.project_spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // Output: Customer is instantiating

        Customer cust = (Customer) context.getBean("customer");
        System.out.println(cust.getId());
        System.out.println(cust.getName());
        System.out.println(cust.getLoanAccount()); // com.penan.project_spring_ioc.LoanAccount@163370c2
        System.out.println(cust.getLoanAccount().getId()); // 10
        System.out.println(cust.getLoanAccount().getName()); // Penan

    }
}
