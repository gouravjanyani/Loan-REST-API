package com.loan.main.requestBean;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class LoanRequestFields {
	
	@JsonProperty("emp_catg")
	private String emp_catg;
	
	@JsonProperty("industry")
	private String industry;
	
	@JsonProperty("company_name")
	private String company_name;
	
	@JsonProperty("salary_amt")
	private int salary_amt;	
	
	@JsonProperty("loan_amt")
	private int Loan_amt;
	
	@JsonProperty("tenure")
	private int loan_tenure;
	
	@JsonProperty("emi_amt")
	private int emi_amt ;
	
		
	

}
