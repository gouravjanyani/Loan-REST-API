package com.loan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.main.requestBean.LoanRequest;
import com.loan.main.responseBean.LoanResponse;
import com.loan.main.responseBean.LoanResponseFields;
import com.loan.main.service.LoanService;



@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/v1/loan")

public class LoanController {
	@Autowired
	LoanService loanService;
	
//	@GetMapping(value = "/details/{loanId}", produces = "application/json")
//	LoanResponse getuserById(@PathVariable("loanId") int loanId) {
//		
//		LoanResponse loanResponse = new LoanResponse();
//		LoanResponseFields loanResponseFields = new LoanResponseFields();
//		loanResponse.setResponse(loanResponseFields);
//		loanService.getLoanById(loanId, loanResponseFields);
//		return loanResponse;
//	}
	
	@PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
	LoanResponse addUser(@RequestBody LoanRequest loanRequest) {
		
		LoanResponse loanResponse = new LoanResponse();
		LoanResponseFields loanResponseFields = new LoanResponseFields();
		loanResponse.setResponse(loanResponseFields);
		loanService.addLoan(loanRequest,loanResponseFields);
		return loanResponse;
	}

}
