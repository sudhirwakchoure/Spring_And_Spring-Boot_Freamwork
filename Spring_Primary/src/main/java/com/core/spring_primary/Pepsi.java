package com.core.spring_primary;


import org.springframework.stereotype.Component;

@Component("pepsi")
public class Pepsi implements ColdDrink {

    @Override
    public void drink() {
        System.out.println(" Drinking Pepsi :: inside the Pepsi class");
    }
}
