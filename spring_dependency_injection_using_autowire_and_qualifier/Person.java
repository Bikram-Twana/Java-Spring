package com.example.spring_dependency_injection_using_autowire_and_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Person {
    private int id;
    private String name;
    @Autowired
    @Qualifier("lap1")
    private Laptop laptop;


    public Person() {
        System.out.println("Person Object is created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }


    public void show()
    {
        System.out.println("You are in show.");
        laptop.working();
    }

}
