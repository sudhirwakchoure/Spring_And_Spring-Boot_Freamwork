package com.core;

import com.core.di.java.annotation.Address;
import com.core.di.java.annotation.Config;
import com.core.di.java.annotation.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("This is the entry point of the application!");
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Address address = context.getBean("address", Address.class);
        System.out.println(address);

        Student student = context.getBean("student", Student.class);
        student.print();
    }
}