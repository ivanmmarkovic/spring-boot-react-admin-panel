package com.example.adminpanel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin("*")
public class AdminController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
