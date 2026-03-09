package com.telusko.myApp;

import org.springframework.stereotype.Component;

@Component
public class Dev {

    Laptop laptop = new Laptop();
    
    public void build(){
        laptop.compile();
        System.out.println("Working on Spring Boot Project");
    }
}
