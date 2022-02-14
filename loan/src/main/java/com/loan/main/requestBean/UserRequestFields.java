package com.loan.main.requestBean;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserRequestFields {

//	@NotBlank(message = "First Name must be mentioned.")
//	@Pattern(regexp = "^[A-Za-z]+$", message = "First Name must be Alphabets")
	@JsonProperty("fname")
	private String first_name;
	
//	@NotBlank(message = "Last Name must be mentioned.")
//	@Pattern(regexp = "^[A-Za-z]+$", message = "Last Name must be Alphabets")
	@JsonProperty("lname")
	private String last_name;
	
//	@Email(message = "Email should be valid")
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("mobile")
	private String mobile;
	
	@JsonProperty("dob")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dateOfBirth;
	
	@JsonProperty("city")
	private String city;
	
	
	@JsonProperty("gender")
	private char gender;
}

