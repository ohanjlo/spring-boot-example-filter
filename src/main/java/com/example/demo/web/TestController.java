package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/a/filter.do")
	public Object hello() {
		return "Hello Filter";
	}

	@GetMapping("/")
	public Object index() {
		return "Welcome Index";
	}

}