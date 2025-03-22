package com.core.di.java.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @Configuration it say the this is confugration class
@Configuration
@ComponentScan(basePackages = "com.core.di.java.annotation")
public class Config {
}
