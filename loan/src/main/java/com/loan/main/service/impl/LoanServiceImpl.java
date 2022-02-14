package com.loan.main.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.main.data.LoanDataTransformation;
import com.loan.main.enumconstant.CommonMessageEnum;
import com.loan.main.model.EmplT;
import com.loan.main.model.LoanDto;
import com.loan.main.model.LoanT;
import com.loan.main.requestBean.LoanRequest;
import com.loan.main.responseBean.LoanResponseFields;
import com.loan.main.service.LoanService;


@Service
public class LoanServiceImpl implements LoanService{

	private static final Logger logger = LoggerFactory.getLogger(System.class);

	@Autowired
	LoanDataTransformation loanDataTransform;
	
	@Override
	public void addLoan(LoanRequest loanRequest, LoanResponseFields loanResponseFields) {
		try {

			loanDataTransform.loanDataRequestTransform(loanRequest, loanResponseFields);
			loanResponseFields.setResponse(200);
			loanResponseFields.setMessage(CommonMessageEnum.RECORD_INSERT_SUCCESS.getValue());
			loanResponseFields.setStatus("true");

		} catch (Exception e) {
			logger.error("UserServiceImpl:following error occurred in the registerUser function :", e);
			loanResponseFields.setResponse(400);
			loanResponseFields.setStatus("false");
			loanResponseFields.setMessage(CommonMessageEnum.RECORD_INSERT_ERROR.getValue());

		}

	}

//	@Override
//	public void getLoanById(int loanId, LoanResponseFields loanResponseFields) {
//		// TODO Auto-generated method stub
//		try {
//
//			
//			LoanDto retLoan=loanDataTransform.getLoanDetailsByLoanId(loanId, loanResponseFields);
//			loanResponseFields.setResponse(200);
//			loanResponseFields.setStatus("true");
//			loanResponseFields.setFname(retLoan.getFname());
//			loanResponseFields.setLname(retLoan.getLname());
//			loanResponseFields.setEmp_catg(retLoan.getEmp_catg());
//			loanResponseFields.setIndustry(retLoan.getLoan_Industry());
//			loanResponseFields.setCompany_name(retLoan.getCompany_name());
//			loanResponseFields.setSalary_amt(retLoan.getSalary_amt());
//			loanResponseFields.setLoan_amt(retLoan.getLoan_amt());
//			loanResponseFields.setTenure(retLoan.getLoan_tenure());
//			loanResponseFields.setEmi_amt(retLoan.getEmi_amt());
//
//		} catch (Exception e) {
//			logger.error("UserServiceImpl:following error occurred in the getUserDetailsByUserId function :", e);
//			loanResponseFields.setResponse(400);
//			loanResponseFields.setStatus("false");
//			loanResponseFields.setMessage(CommonMessageEnum.DATA_FETCHED_FAILED.getValue());
//
//		}
//		
//	}
}
