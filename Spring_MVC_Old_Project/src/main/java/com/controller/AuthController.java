package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {
	
	@RequestMapping("/home")
	public String Userhome() {
		System.out.println("this is user Auth Controller controller ");
		return "auth_home";
		
	}

}
