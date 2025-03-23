package com.core.spring_bean_lifecycle;


import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {
    public void startEngine() {
        System.out.println("Engine is starting:: inside the Engine class");
    }
}
