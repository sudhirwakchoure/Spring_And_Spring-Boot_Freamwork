package com.core.spring_bean_Scope;


import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {
    public void startEngine() {
        System.out.println("Engine is starting:: inside the Engine class");
    }
}
