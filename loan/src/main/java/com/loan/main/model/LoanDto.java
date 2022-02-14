package com.loan.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoanDto {
	
	@JsonProperty("status")
	private String status; 
	
	@JsonProperty("response")
	private int response;
	
	@JsonProperty("fname")
	private String Fname; 

	@JsonProperty("lname")
	private String Lname; 

	@JsonProperty("emp_catg")
	private String emp_catg; 
	
	@JsonProperty("industry")
	private String industry; 
	
	@JsonProperty("company_name")
	private String company_name; 
	
	@JsonProperty("salary_amt")
	private int salary_amt; 
	
	@JsonProperty("loan_amt")
	private int loan_amt; 
	
	@JsonProperty("tenure")
	private int tenure; 
	
	@JsonProperty("emi_amt")
	private int emi_amt;

	@JsonProperty("Message")
	private String message;

}
