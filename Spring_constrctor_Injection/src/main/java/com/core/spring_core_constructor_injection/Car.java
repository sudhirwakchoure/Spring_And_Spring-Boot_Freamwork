package com.core.spring_core_constructor_injection;

public class Car {

    Engine engine;

    public Car(Engine engine) {
        System.out.println("Inside the constructor of Car class :: dependency injected through constructor ");
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Car started:: Inside the Car class ");
        engine.startEngine();
    }
}
