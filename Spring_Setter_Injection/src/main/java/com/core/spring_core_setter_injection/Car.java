package com.core.spring_core_setter_injection;

public class Car {

    Engine engine;

    //getter method
    public Engine getEngine() {
        return engine;
    }

    //setter method
    public void setEngine(Engine engine) {
        System.out.println("Inside the setter method of Car class :: dependency injected through setter method ");
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Car started:: Inside the Car class ");
        engine.startEngine();
    }
}
