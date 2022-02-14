package com.loan.main.requestBean;
//
//import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest {

//	@NonNull (message = "Sorry, Bad user request.")
	@JsonProperty("request")
	UserRequestFields  userRequestFields;
	
	public UserRequestFields getUserRequestFields() {
		return userRequestFields;
	}
	
	public void setUserRequestFields(UserRequestFields  userRequestFields) {
		this.userRequestFields = userRequestFields;
	}
	
}
