package org.themohit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.themohit.Computer;
import org.themohit.Desktop;
import org.themohit.Developer;
import org.themohit.Laptop;

@Configuration
@ComponentScan("org.themohit")
public class JavaConfig {
////    @Bean(name = {"desktop1","com1","personal"})
//    @Bean
////    @Scope(value = "prototype")
//    public Desktop desk1(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Developer dev(@Autowired @Qualifier("desk1") Computer com){
//        Developer obj=new Developer();
//        obj.setAge(23);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
////    @Primary
//    public Laptop lap1(){
//        return new Laptop();
//    }

}
