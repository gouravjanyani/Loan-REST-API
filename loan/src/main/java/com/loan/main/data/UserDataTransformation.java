package com.loan.main.data;

import org.springframework.stereotype.Service;

import com.loan.main.requestBean.UserRequest;
import com.loan.main.responseBean.UserResponseFields;

@Service
public interface UserDataTransformation {

	

	void userDataRequestTransform(UserRequest userRequest, UserResponseFields userResponseFields);

}
