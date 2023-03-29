package com.holamundo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
	
	@GetMapping("/gretting")
	public String getGrett()
	{
		return "gretting";
	}
	
	@GetMapping("/sayHello")
	public String getHello(
			@RequestParam( name = "name",defaultValue = "Not one") String name,
			Model model){
		model.addAttribute("someone",name);
		return "sayHello";
		
	}
}
