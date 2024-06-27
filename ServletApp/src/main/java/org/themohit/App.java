package org.themohit;

import org.apache.catalina.Context;
import org.apache.catalina.Executor;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Tomcat tc=new Tomcat();
        try{
            tc.setPort(7000);
            Context context=tc.addContext("",null);
            tc.addServlet(context,"firstServlet",new MyFirstServlet());
            context.addServletMappingDecoded("/root","firstServlet");

            tc.start();
            tc.getServer().await();
        }catch (Exception ex){
            System.out.println("Error Found!");
        }

    }
}
