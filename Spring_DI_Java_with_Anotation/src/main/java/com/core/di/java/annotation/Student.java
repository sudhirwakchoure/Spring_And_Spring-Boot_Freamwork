package com.core.di.java.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private Address address;

    public String getName() {
        System.out.println("Student getName method :: student class");
        return name;
    }

    @Autowired
    public void setName(@Value("John Doe") String name) { // Example default value
        System.out.println("Student setName method :: student class");
        this.name = name;
    }

    public Address getAddress() {
        System.out.println("Student getAddress method :: student class");
        return address;
    }

    @Autowired
    public void setAddress(Address address) {
        System.out.println("Student setAddress method :: student class");
        this.address = address;
    }

    public void print() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Address: " + address.toString());
    }
}