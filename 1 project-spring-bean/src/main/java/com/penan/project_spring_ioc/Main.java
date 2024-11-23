package com.penan.project_spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Beans.class); // Output: Customer is instantiating

        Customer cust = (Customer) context.getBean("customer");
        System.out.println(cust.getId());
        System.out.println(cust.getName());

        LoanAccount loanAccount = (LoanAccount) context.getBean("loanAccount");
        System.out.println(loanAccount.getId());
        System.out.println(loanAccount.getName());

    }

}
