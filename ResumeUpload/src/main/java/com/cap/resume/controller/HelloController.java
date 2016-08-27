package com.cap.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(Model model){
		
		model.addAttribute("name", "Avanesh");
		
		return "hello";
	}
	
	@RequestMapping("/")
	public String sayHello(Model model){
		
		model.addAttribute("name", "Sharma");
		
		return "index";
	}

	
	
}
