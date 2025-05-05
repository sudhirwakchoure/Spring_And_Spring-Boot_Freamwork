package com.core.spring.jdbc.spring_mvc_example.controller;

import org.apache.tomcat.util.http.ConcurrentDateFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("this is admin home page");

        String title = "admin page";
        List<String> users = List.of("sudhir", "roshani", "om");
        model.addAttribute("title", title);
        model.addAttribute("users", users);

        Object ConcurrentDateFormat;
        model.addAttribute("date" , LocalDateTime.now());
         return "admin/home";
    }
}
