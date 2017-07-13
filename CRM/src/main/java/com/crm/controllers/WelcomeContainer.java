package com.crm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeContainer {
	@GetMapping("/start")
	public String welcome() {
		return "Base version ";
	}
}
