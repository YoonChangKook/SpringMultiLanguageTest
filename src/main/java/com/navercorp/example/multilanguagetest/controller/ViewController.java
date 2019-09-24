package com.navercorp.example.multilanguagetest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
