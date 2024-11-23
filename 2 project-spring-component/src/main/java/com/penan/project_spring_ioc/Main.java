package com.penan.project_spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // Output: Customer is instantiating

        System.out.println(context.getBeanDefinitionCount());
        // for (String name : context.getBeanDefinitionNames()) {
        //     System.out.println(name);
        // }

        // Retrieve the Customer bean from the context
        Customer customer = context.getBean(Customer.class);
        customer.setId(123);
        customer.setName("Penan Rajput");
        System.out.println("Customer Id: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());

        // Close the context
        ((AbstractApplicationContext) context).close();

    }

}
