package com.fis.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.user.bean.User;


@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/{number}")
	public User getUser(@PathVariable long number) {
		return new User(10, "Meghana", "Password");
	}

}