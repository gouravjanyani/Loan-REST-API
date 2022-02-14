package com.loan.main.controller;

import com.loan.main.responseBean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.main.requestBean.UserRequest;
import com.loan.main.responseBean.UserResponse;
import com.loan.main.service.UserService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/v1/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
	UserResponse addUser(@RequestBody UserRequest userRequest) {
		
		UserResponse userResponse = new UserResponse();
		UserResponseFields userResponseFields = new UserResponseFields();
		userResponse.setResponse(userResponseFields);
		userService.addUser(userRequest,userResponseFields);
		return userResponse;
	}

}
