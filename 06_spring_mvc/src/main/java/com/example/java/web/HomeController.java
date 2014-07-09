package com.example.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@ModelAttribute
	public User model() {
		return new User("Péter", "Budapest");
	}

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String index() {
		return "home";
	}
}
