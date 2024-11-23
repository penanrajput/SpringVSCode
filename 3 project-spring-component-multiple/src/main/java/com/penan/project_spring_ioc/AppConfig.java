package com.penan.project_spring_ioc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.penan.project_spring_ioc", "com.penan.package1"})

public class AppConfig {

}
