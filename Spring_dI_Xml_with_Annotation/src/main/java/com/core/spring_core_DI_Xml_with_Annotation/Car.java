package com.core.spring_core_DI_Xml_with_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/*  @component It's used to indicate that a class is a Spring component,
    or we can say that we need to crate a bean of the class
* */
@Component
public class Car {


    @Autowired
    Engine engine;


    /*If class contain both getter setter and constructor injection then by default use constructor injection
     then depends on user choices which one use then use Autowired annotation  before that like setter or
     constructor on field
       @Aurowired (this is filed injection)
       Engine engine;

        @Autowired  (this is setter injection)
        public void setEngine(Engine engine) {
        System.out.println("Inside the setter of Car class :: dependency injected through setter ");
        this.engine = engine;

        by default dependency injection done thought the Constructor Injection
        if you have only constructor in class then no need to use Autowire other also no need
        because  by default dependency injection done thought the Constructor Injection

        public Car(Engine engine) {
        System.out.println("Inside the constructor of Car class :: dependency injected through constructor ");
        this.engine = engine;
    }
    }
    * */

    /*public Engine getEngine() {
        System.out.println("Inside the getter of Car class :: dependency injected through setter ");
        return engine;
    }
   */


    /*@Autowired
    public void setEngine(Engine engine) {
        System.out.println("Inside the setter of Car class :: dependency injected through setter ");
        this.engine = engine;
    }*/

    /*public Car() {
        System.out.println("Inside the constructor of Car class :: dependency injected through constructor but no parameterized constructor ");
    }*/


    //by default dependency injection done thought the Constructor Injection
    /*public Car(Engine engine) {
        System.out.println("Inside the constructor of Car class :: dependency injected through constructor ");
        this.engine = engine;
    }*/


    public void startCar() {
        System.out.println("Car started:: Inside the Car class ");
        engine.startEngine();
    }
}
