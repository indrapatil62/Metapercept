package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/")
	public String show() {
		return "index";
	}
	
	

}
