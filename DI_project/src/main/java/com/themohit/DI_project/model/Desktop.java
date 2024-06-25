package com.themohit.DI_project.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    @Override
    public void compile(){
        System.out.println("compiling code on desktop");
    }
}
