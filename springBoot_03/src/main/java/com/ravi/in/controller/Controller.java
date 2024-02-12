package com.ravi.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.in.model.User;
import com.ravi.in.service.UserService;


@RestController
public class Controller {

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/user")
	public User gdtUser(@RequestParam Integer id) {

		User user = userService.getUser(id);
		return user;

	}
	@GetMapping("/greet")
	public String greet() {
		return "hello world";
	}
}
