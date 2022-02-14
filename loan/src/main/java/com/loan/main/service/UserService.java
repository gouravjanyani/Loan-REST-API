package com.loan.main.service;

import com.loan.main.requestBean.UserRequest;
import com.loan.main.responseBean.UserResponseFields;

public interface UserService {
	
	void addUser(UserRequest userRequest, UserResponseFields userResponseFields);

}
