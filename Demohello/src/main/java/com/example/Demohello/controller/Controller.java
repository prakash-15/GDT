package com.example.Demohello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/GDT")
	public String Helloworld() {

		return "Welcome GDT";
	}
}
