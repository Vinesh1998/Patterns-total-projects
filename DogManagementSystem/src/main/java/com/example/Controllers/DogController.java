package com.example.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DogController {
	@RequestMapping("dog Home")
	public String home() {
		return "home";
	}

}
