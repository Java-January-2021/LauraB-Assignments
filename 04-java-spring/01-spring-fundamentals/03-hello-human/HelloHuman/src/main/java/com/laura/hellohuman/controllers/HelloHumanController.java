package com.laura.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloHumanController {
	
	//Greet whoever visits your page. If they don't tell you their name, then greet them as "human"
	
	@RequestMapping("/")
	public String index(Model model, @RequestParam(value="name", required=false, defaultValue="Human") String name){ 
		System.out.println(name);
		model.addAttribute("user", name);
		return "index.jsp";
	}

}
