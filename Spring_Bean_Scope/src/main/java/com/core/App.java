package com.core;

import com.core.spring_bean_Scope.Car;
import com.core.spring_bean_Scope.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
   In this code we show the scope of the bean
   now hre we show  2 scope
  1) singleton  2) prototype

 1)  by default is singleton : (single object created if we create another give same ref)
    Only one instance will be created for
   a single bean definition per Spring IoC container and
   the same object will be shared for each request made for that bean.

   2) Prototype: A new instance will be created for a single bean definition every time
      a request is made for that bean.

* */


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "This is the main method of the bean lifecycle class" );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Car car = context.getBean("car", Car.class);
        Car car1 = context.getBean("car", Car.class);
        car.startCar();
        System.out.println("This is a car objet  : " +car);
        System.out.println("This is a car1 objet : "  +car1);


        // this is also way be this close when the jvn is closed
       //  context.registerShutdownHook();
        //this close on running time of code not required to wait for jvm shutdown or close
        context.close();
    }
}
