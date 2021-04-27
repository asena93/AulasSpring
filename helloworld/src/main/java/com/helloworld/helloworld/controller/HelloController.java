package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")

public class HelloController {
	
	@GetMapping
	public String helloworld() {
		return "Persistência e Proatividade";
	}
	
}