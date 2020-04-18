package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("/hello")
	public String hello() {
		logger.info("logging output test");
		System.out.println("standard output test");
		
		return "hello " + sampleService.getName();
	}
	
	
	
	@ResponseBody
	@RequestMapping("/")
	public String root() {
		return "Spring Boot Test";
	}

}
