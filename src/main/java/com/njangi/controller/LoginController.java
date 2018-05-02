package com.njangi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@RequestMapping("/user")
	public String login() {
		return "after login as a user";
	}
	

	@RequestMapping("admin")
	public String adminLogin() {
		return "after login as an admin";
	}
	
}
