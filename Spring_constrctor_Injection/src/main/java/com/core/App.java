package com.core;

import com.core.spring_core_constructor_injection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Entry point of the application" );

        //use application context interface because build top of the bean factory
        ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Car car=context.getBean("car" , Car.class);
        car.startCar();


    }
}
