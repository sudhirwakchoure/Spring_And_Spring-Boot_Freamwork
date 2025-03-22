package com.core.Constructor_DI_with_java;

import org.springframework.stereotype.Component;

/*
@component say  that this is the component class or we need to crate a bean of this class
 */

@Component
public class Engine {

    public void startEngine(){
        System.out.println("Engine is started:: inside the engine class");
    }
}
