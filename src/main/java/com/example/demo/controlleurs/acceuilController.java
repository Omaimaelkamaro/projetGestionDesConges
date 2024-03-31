package com.example.demo.controlleurs;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class acceuilController {

	
	@RequestMapping("/acceuil")
	public String index() {
		return "acceuil";
}
}
