package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    
    @Autowired  //field injection
    private  Computer comp;

    // public Dev(Computer comp){     // this is the constructor injection
    //     this.comp = comp;     // in constructior injection the @Autowired is optional or its invoked by default
    // }

    //@Autowired   // this is the method injection
    // public void setLaptop(Computer comp  ){     // this is the setter injection
    //     this.comp = comp;
    // }



    public void build(){
        comp.compile();
        System.out.println("Working on Spring Boot Project");
    }
}
