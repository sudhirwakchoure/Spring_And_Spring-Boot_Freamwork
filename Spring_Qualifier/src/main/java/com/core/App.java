package com.core;

import com.core.spring_qualifier.Config;
import com.core.spring_qualifier.Human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/*  This is a example of use of  @qualifier */




public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "This is Qualifier example!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        Human sudhir = context.getBean("human", Human.class);
        sudhir.tryColdDrink();

    }
}
