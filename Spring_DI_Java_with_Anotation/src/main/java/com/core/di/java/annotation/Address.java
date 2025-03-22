package com.core.di.java.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city;
    private String state;
    private String country;

    public String getCity() {
        System.out.println("Address getCity method :: address class");
        return city;
    }

    @Autowired
    public void setCity(@Value("Shirdi") String city) { // Example default value
        System.out.println("Address setCity method :: address class");
        this.city = city;
    }

    public String getState() {
        System.out.println("Address getState method :: address class");
        return state;
    }

    @Autowired
    public void setState(@Value("Maharashtra") String state) { // Example default value
        System.out.println("Address setState method :: address class");
        this.state = state;
    }

    public String getCountry() {
        System.out.println("Address getCountry method :: address class");
        return country;
    }

    @Autowired
    public void setCountry(@Value("India") String country) { // Example default value
        System.out.println("Address setCountry method :: address class");
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
    }
}