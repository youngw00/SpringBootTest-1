package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello " + sampleService.getName();
	}
	
	
	
	@ResponseBody
	@RequestMapping("/")
	public String root() {
		return "Spring Boot Test";
	}

}
