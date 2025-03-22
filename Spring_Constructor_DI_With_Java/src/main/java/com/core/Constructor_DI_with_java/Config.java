package com.core.Constructor_DI_with_java;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
@Configuration say  that this the Configuration class
 */

/* suppose you have  multiple packages in you  class then you just give the base package like 
   here base package is    "com.core" 
*/

@Configuration
@ComponentScan(basePackages = "com.core.Constructor_DI_with_java")
public class Config {
}
