package com.ab.firstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    private Laptop laptop;
    public void build(){
        laptop.compile();
        System.out.println("working on spring project.");
    }
}
