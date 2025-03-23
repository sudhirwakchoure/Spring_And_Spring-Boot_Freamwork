package com.core;

import com.core.spring_bean_lifecycle.Car;
import com.core.spring_bean_lifecycle.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "This is the main method of the bean lifecycle class" );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Car car = context.getBean("car", Car.class);
        car.startCar();


        // this is also way be this close when the jvn is closed
       //  context.registerShutdownHook();
        //this close on running time of code not required to wait for jvm shutdown or close
        context.close();
    }
}
