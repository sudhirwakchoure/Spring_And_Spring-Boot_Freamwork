package com.core.spring.jdbc.spring_mvc_example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("This is home page");
       return "home";
    }


    @RequestMapping("/about")
    public String about(){
        System.out.println("This is about page");
        return "about";
    }

}
