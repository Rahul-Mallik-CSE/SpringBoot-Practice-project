package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    
    @Autowired  //field injection
    private  Laptop laptop ;

    // public Dev(Laptop laptop){     // this is the constructor injection
    //     this.laptop = laptop;
    // }

    public void build(){
        laptop.compile();
        System.out.println("Working on Spring Boot Project");
    }
}
