package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(){
		return "home.jsp";
	}
	@RequestMapping("/login")
	public String loginPage(){
		return "/login.jsp";
	}

	@RequestMapping("/logout-sucess")
	public String logout(){
		return "/logout.jsp";
	}
}