package com.core;

import com.core.Constructor_DI_with_java.Car;
import com.core.Constructor_DI_with_java.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "This is the entry point of the application" );

        ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        Car car = context.getBean(Car.class);
        car.startCar();
    }
}
