package com.loan.main.data;

import org.springframework.stereotype.Service;

import com.loan.main.model.LoanT;
import com.loan.main.requestBean.LoanRequest;
import com.loan.main.responseBean.LoanResponseFields;

@Service
public interface LoanDataTransformation {

	void loanDataRequestTransform(LoanRequest loanRequest, LoanResponseFields loanResponseFields);

//	LoanT getLoanDetailsByLoanId(int loanId, LoanResponseFields loanResponseFields);
}
