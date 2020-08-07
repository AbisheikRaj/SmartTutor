package com.example.vguru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/prekg")
	public String prekg() {
		return "prekg";
	}

	@GetMapping("/Higher")
	public String Higher() {
		return "Maths";
	}

	@GetMapping("/JEE")
	public String JEE() {
		return "JEE";
	}

	@GetMapping("/NEET")
	public String NEET() {
		return "NEET";
	}

	@GetMapping("/Lower")
	public String Lower() {
		return "Science";
	}

	@GetMapping("/rhymes")
	public String rhymes() {
		return "rhymes";
	}

	@GetMapping("/numbers")
	public String number() {
		return "numbers";
	}

	@GetMapping("/alphabets")
	public String alphabets() {
		return "alphabets";
	}
}
