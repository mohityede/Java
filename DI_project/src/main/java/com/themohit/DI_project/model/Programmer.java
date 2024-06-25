package com.themohit.DI_project.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Programmer {
    Computer com;
    @Value("24")
    int age;
    public void code(){
        System.out.println("I'm Coding.........");
        com.compile();
    }

    public Computer getCom() {
        return com;
    }
    @Autowired
//    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
