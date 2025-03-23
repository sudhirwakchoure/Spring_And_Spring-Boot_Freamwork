package com.core;

import com.core.spring_bean_lifecycle_annotation.Car;
import com.core.spring_bean_lifecycle_annotation.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "This is the code spring bean life cycle using annotation based" );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Car car = context.getBean("car", Car.class);
        car.startCar();
        context.close();

    }
}
