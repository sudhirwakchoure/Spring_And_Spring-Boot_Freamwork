package com.core.spring_primary;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
 @Primary annotation designates a preferred bean when multiple
  beans of the same type are candidates for autowiring,
 resolving ambiguity and ensuring a specific bean is injected.

*/

@Component("cocacola")
@Primary
public class Cocacola implements ColdDrink {

    @Override
    public void drink() {
        System.out.println(" Drinking Cocacola :: inside the Cococola class");
    }
}
