package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Siscontroller {

	
	@RequestMapping("/makeup")
	public String makeup() {
		return "makeup";
	}
	
}
