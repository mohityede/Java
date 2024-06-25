package org.themohit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.themohit.config.JavaConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
//        Desktop desk=context.getBean("personal",Desktop.class);
//        Desktop desk=context.getBean("desk1",Desktop.class);
//        desk.compile();
//        Desktop desk2=context.getBean("desk1",Desktop.class);
//        desk2.compile();

        Developer dev1= context.getBean(Developer.class);
        System.out.println(dev1.getAge());
        dev1.code();



//        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//        Developer dev2= context.getBean("dev2",Developer.class);
//        System.out.println(dev2.getAge());
//        dev2.code();
//        Computer lapy=context.getBean(Computer.class);

        // if score is prototype it will create object when we getBean
//        Developer dev= (Developer) context.getBean("dev1");
//        dev.age=24;
//        System.out.println("dev age:"+ dev.age);
//        System.out.println("dev2 age:"+dev2.age);
//        if(dev==dev2) System.out.println("dev & dev2 are same");
//        dev.code();
    }
}
