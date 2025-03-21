package com.core.spring_core_DI_Xml_with_Annotation;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    public void startEngine() {
        System.out.println("Engine started:: Inside the Engine class ");
    }
}
