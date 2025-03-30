package com.core.springaop.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/service")
    public String service(){
        return "service";
    }

}
