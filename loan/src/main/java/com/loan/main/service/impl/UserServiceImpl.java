package com.loan.main.service.impl;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.main.data.UserDataTransformation;
import com.loan.main.enumconstant.CommonMessageEnum;
import com.loan.main.requestBean.UserRequest;
import com.loan.main.responseBean.UserResponseFields;
import com.loan.main.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(System.class);

	@Autowired
	UserDataTransformation userDataTransform;
	
	@Override
	public void addUser(UserRequest userRequest, UserResponseFields userResponseFields) {
		try {

			userDataTransform.userDataRequestTransform(userRequest, userResponseFields);
			userResponseFields.setResponse(200);
			userResponseFields.setMessage(CommonMessageEnum.RECORD_INSERT_SUCCESS.getValue());
			userResponseFields.setStatus("true");

		} catch (Exception e) {
			logger.error("UserServiceImpl:following error occurred in the registerUser function :", e);
			userResponseFields.setResponse(400);
			userResponseFields.setStatus("false");
			userResponseFields.setMessage(CommonMessageEnum.RECORD_INSERT_ERROR.getValue());

		}

	}

}
