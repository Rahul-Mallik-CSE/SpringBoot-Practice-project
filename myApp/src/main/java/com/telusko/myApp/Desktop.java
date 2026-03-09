package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("laptop")  // this is used to specify which bean to inject when there are multiple beans of the same type
public class Desktop implements Computer{


    public void compile(){
        System.out.println("Compiling with 404 bugs but faster");
    }
}
