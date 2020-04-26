package com.codestuff.greentwig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class IndexController {
	
	@RequestMapping("/f5")
	public String f5Monitor() {
		System.out.println("Request Received at F5Monitor");
		return "OK";
	}
}
