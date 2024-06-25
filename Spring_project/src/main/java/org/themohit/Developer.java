package org.themohit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component()
public class Developer {
    @Value("23")
    private int age;
    @Autowired
    @Qualifier("desk1")
    private Computer com;

    public Developer(){
        System.out.println("Developer construtor called..");
    }

//    @ConstructorProperties({"age","lapy"})
    public Developer(int age, Computer com) {
        System.out.println("para constructor called");
        this.age = age;
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("age setter called");
        this.age = age;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding...");
        com.compile();
    }
}
