package com.loan.main.service;


import com.loan.main.requestBean.LoanRequest;
import com.loan.main.responseBean.LoanResponseFields;



public interface LoanService {
//	void getLoanById(int loanId,LoanResponseFields loanResponseFields);
	void addLoan(LoanRequest loanRequest, LoanResponseFields loanResponseFields);

}
