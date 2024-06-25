package org.themohit;

import org.springframework.stereotype.Component;

@Component("desk1")
public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop construtor called..");
    }

    @Override
    public void compile(){
        System.out.println("compiling code on desktop...");
    }
}
