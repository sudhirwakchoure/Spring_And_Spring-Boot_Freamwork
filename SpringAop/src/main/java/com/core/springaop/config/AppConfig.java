package com.core.springaop.config;


import Pack.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student() {
        System.out.println("student is created");
        return new Student();
    }
}
