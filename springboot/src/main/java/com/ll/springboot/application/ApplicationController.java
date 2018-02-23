package com.ll.springboot.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	
	@RequestMapping("/index")
	public String index(){
		return "Hello Spring Boot";
	}
}
