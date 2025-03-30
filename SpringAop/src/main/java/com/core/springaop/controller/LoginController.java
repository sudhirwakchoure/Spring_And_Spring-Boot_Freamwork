package com.core.springaop.controller;

import com.core.springaop.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {

   @Autowired
    private LoginService loginService;

    @RequestMapping("/")
    public String login(){
        System.out.println("this is login controller");

        boolean login = loginService.doLogin();
        if(login){
            return "success";
        }else{
            return "login";
        }

    }
}
