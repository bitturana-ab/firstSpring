package com.ab.firstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("desktop")
    private Computer computer;
    public void build(){
        computer.compile();
        System.out.println("working on spring project.");
    }
}
