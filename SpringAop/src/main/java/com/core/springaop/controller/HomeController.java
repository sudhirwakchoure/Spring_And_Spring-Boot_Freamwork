package com.core.springaop.controller;

import Pack.Student;
import com.core.springaop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {



    @Autowired
    private Student student;

    @Autowired
    private ProductService productService;



    public HomeController() {

        System.out.println("home controller bean is created");
    }


    @RequestMapping("/magic")
     public String test() throws InterruptedException {
        Thread.sleep(1000);
        productService.createProduct();
        return "This is magic";
     }


    @RequestMapping("/another")
     public String another(){
        return "This is actually magic";
     }


}
