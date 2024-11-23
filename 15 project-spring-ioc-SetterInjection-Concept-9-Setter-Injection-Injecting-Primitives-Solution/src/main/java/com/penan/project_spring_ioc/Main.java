package com.penan.project_spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // Output: Customer is instantiating

        System.out.println("context.getBeanDefinitionCount: " + context.getBeanDefinitionCount());

        Account acc = (Account) context.getBean("account");
        System.out.println("Account: " + acc);

    }
}
