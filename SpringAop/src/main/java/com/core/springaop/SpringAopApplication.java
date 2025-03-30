package com.core.springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//here we can scan only base package like here com.core.springaop but when you create the package outside
// this package then you give error  so we need to pass that package into component scan otherwise create
//  NEW  CLASS AppCofig
@SpringBootApplication
public class SpringAopApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringAopApplication.class, args);
    }

}
