package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class UserController {
	
	@RequestMapping("/home")
	public String Userhome() {
		System.out.println("this is user home controller ");
		return "user_home";
		
	}

}
