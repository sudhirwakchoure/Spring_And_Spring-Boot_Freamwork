package com.core.spring_bean_Scope;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("car")
@Scope("prototype")
public class Car{

    Engine engine;

    public Car() {
        System.out.println("Car is created:: inside the Car class   this is used for bean initialization" +
                "inside the default constructor or no-arg constructor");
        System.out.println("car is created .........");

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

}


