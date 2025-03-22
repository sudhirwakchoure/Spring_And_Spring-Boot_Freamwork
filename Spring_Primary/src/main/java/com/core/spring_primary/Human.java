package com.core.spring_primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("human")
public class Human {


    /*  This is a example of use of  @qualifier
    The @Qualifier annotation in Spring Framework helps resolve
    ambiguity when multiple beans of the same type are available for dependency injection,
    allowing you to specify which bean should be injected using bean names or custom qualifiers

    here we use  field DI  but this no a recommended use constructor injection

    if you don't want to use @Qualifier  instead of that use @primary  annotation

    @primary annotation
     @Primary annotation designates a preferred bean when multiple beans of the same type are
     candidates for autowiring, resolving ambiguity and ensuring a specific bean is injected.
    in this code Coco cola is primary

    */


    ColdDrink coldDrink;

    @Autowired
    public Human(ColdDrink coldDrink) {
        System.out.println( "Human :: Constructor dependency injection by constructor" );
        this.coldDrink = coldDrink;
    }

    public void tryColdDrink(){
        coldDrink.drink();
    }

}
