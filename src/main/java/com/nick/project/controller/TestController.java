package com.nick.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="")
public class TestController {
	
	@RequestMapping(value ="/index")
	public String testMethod(){
		System.out.println("Inside Test Method");
		return "test" ;
	}

}
