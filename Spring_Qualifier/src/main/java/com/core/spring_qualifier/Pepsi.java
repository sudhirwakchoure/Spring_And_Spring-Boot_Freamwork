package com.core.spring_qualifier;


import org.springframework.stereotype.Component;

@Component("pepsi")
public class Pepsi implements ColdDrink {

    @Override
    public void drink() {
        System.out.println(" Drinking Pepsi :: inside the Pepsi class");
    }
}
