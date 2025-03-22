package com.core.spring_qualifier;


import org.springframework.stereotype.Component;

@Component("cocacola")
public class Cocacola implements ColdDrink {

    @Override
    public void drink() {
        System.out.println(" Drinking Cocacola :: inside the Cococola class");
    }
}
