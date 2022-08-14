package com.example.spring_dependency_injection_using_autowire_and_qualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionUsingAutowireAndQualifierApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDependencyInjectionUsingAutowireAndQualifierApplication.class, args);
        Person p1 = context.getBean(Person.class);

//        Person p2 = context.getBean(Person.class); // creating multiple object using prototype
        p1.show();


        
    }

}

