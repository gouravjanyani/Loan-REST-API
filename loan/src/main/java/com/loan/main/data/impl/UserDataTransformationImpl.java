package com.loan.main.data.impl;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.main.data.UserDataTransformation;
import com.loan.main.model.UserT;
import com.loan.main.repository.UserTRepo;
import com.loan.main.requestBean.UserRequest;
import com.loan.main.requestBean.UserRequestFields;
import com.loan.main.responseBean.UserResponseFields;

@Service
public class UserDataTransformationImpl implements UserDataTransformation{
	
	private static final Logger logger = LoggerFactory.getLogger(System.class);
	
	@Autowired
	UserTRepo userTRepo; // Inject userTRepo

	@Override
	public void userDataRequestTransform(UserRequest userRequest, UserResponseFields userResponseFields) {
	
		UserT userT = new UserT();
		
		UserRequestFields userRequestFields = userRequest.getUserRequestFields();
		createUserT(userRequestFields,userT);
		
	}

	private void createUserT(UserRequestFields userRequestFields, UserT userT) {
		
		try {
			
			Timestamp timestamp = new  Timestamp(new java.util.Date().getTime());

			userT.setFirst_name(userRequestFields.getFirst_name());
			userT.setLast_name(userRequestFields.getLast_name());
			userT.setEmail(userRequestFields.getEmail());
			userT.setMobile(userRequestFields.getMobile());
			userT.setDateOfBirth(userRequestFields.getDateOfBirth());
			userT.setCity(userRequestFields.getCity());			
			userT.setStatus(1);
			
			userT = userTRepo.save(userT);

		} catch (Exception e) {

			logger.error("UserDataTransformationImpl:following error occurred in the createUserT() function :", e);
		}

	}

}
