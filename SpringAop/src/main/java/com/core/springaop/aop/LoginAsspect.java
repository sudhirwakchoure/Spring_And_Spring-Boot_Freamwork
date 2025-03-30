package com.core.springaop.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoginAsspect {

    //this is an expression
    //cross-cutting concern
    //* match any return type and method or any package * mains any
    //com.core.springaop.services.ProductService fully qualified name
    //createProduct method name
    //(..) this is nothing but any argument

    @Before("execution(* com.core.springaop.services.ProductService.createProduct(..))")
    public void greeting(){
        System.out.println(" hi greeting  starting ");
    }

    @After("execution(* com.core.springaop.services.ProductService.createProduct(..))")
    public void beyBy(){
        System.out.println("beyBy beyBy Terminating ");
    }
}
