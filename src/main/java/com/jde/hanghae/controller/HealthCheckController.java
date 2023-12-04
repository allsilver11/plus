package com.jde.hanghae.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/plus")
public class HealthCheckController {

	@PostMapping(value = "/healthcheck")
	public String healthCheck() {
		
		return "hello world!";
	}
	
}
