package com.ab.firstSpring;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public void compile(){
        System.out.println("compile successfully.");
    }
}
