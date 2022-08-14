package com.example.spring_dependency_injection_using_autowire_and_qualifier;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
    private int lid;
    private String brand;

    public Laptop() {
        System.out.println("You called Laptop");
    }


    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void working()
    {
        System.out.println("Laptop is Working");
    }

}
