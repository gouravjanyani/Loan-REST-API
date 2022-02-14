package com.loan.main.responseBean;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserResponseFields {
	
	@JsonProperty("status")
	private String status; 
	
	@JsonProperty("response")
	private int response;
	
	@JsonProperty("Message")
	private String message;

}
