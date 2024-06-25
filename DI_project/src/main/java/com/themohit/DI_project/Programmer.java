package com.themohit.DI_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {
    @Autowired
    Laptop lap;
    public void code(){
        lap.compile();
        System.out.println("I'm Coding.........");
    }
}
