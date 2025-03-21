package com.core;

import com.core.spring_core_DI_Xml_with_Annotation.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class  App
{
    public static void main( String[] args )
    {
        System.out.println( "This is the Spring DI with XML  using annotation  Example " );

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Car car = context.getBean(Car.class);
        car.startCar();
    }
}
