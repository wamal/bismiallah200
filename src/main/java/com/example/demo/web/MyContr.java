package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hanoiaaaa")
public class MyContr {
	@RequestMapping("/smm")
	String welcome() {
		return "index";
	}
}
