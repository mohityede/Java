package org.themohit.spring_security_demo.model;

public class Student{
    public String name;
    public Student(String name){
        this.name=name;
    }

    public Student(){}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
