package com.loan.main.requestBean;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class LoanRequest {

	
	@NotNull (message = "Sorry, Bad user request.")
	@JsonProperty("request")
	@Valid
	LoanRequestFields  loanRequestFields;
	
	public LoanRequestFields getLoanRequestFields() {
		return loanRequestFields;
	}
	
	public void setLoanRequestFields(LoanRequestFields  loanRequestFields) {
		this.loanRequestFields = loanRequestFields;
	}
}
