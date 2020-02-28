package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hoge {

	@GetMapping("/hello")
	String hello() {
		return "Hello";

	}

	@GetMapping("/hoge")
	String hoge() {
		return "hoge";

	}
}
