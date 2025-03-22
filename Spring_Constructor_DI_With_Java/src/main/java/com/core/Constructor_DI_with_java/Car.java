package com.core.Constructor_DI_with_java;


import org.springframework.stereotype.Component;


/*
@component say  that this is the component class or we need to crate a bean of this class
 */

@Component
public class Car {

    Engine engine;

    public Car(Engine engine){
        System.out.println("Car is created:: inside the car class DI through constructor");
        this.engine = engine;
    }

    public void startCar(){
        System.out.println("Car is started:: inside the car class");
        engine.startEngine();
    }


}
