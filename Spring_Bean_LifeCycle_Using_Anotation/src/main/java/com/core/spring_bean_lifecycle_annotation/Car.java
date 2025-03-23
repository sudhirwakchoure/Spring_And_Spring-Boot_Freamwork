package com.core.spring_bean_lifecycle_annotation;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car")

public class Car {

    Engine engine;

   public Car() {
        System.out.println("Car is created:: inside the Car class   this is used for bean initialization" +
                "inside the default constructor or no-arg constructor" );

    }

    public Car(Engine engine) {
        System.out.println("Car is created:: inside the Car class   " +
                "this is used for bean initialization" +
                "using the constructor injection");
        this.engine = engine;
    }

    public Engine getEngine() {
        System.out.println("Engine is getting:: inside the Car class");
        return engine;
    }


    @Autowired
    public void setEngine(Engine engine) {
        System.out.println("Engine is setting:: inside the Car class");
        this.engine = engine;
    }

    public void startCar() {
        engine.startEngine();
        System.out.println("Car is starting:: inside the Car class");
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("this method call automatically after the bean is initialized or the properties are set");
    }



    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("this method call automatically before the bean is destroyed");
    }

}
