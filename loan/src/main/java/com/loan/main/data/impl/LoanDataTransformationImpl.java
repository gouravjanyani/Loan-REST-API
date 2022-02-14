package com.loan.main.data.impl;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.main.data.LoanDataTransformation;
import com.loan.main.model.LoanT;
import com.loan.main.repository.EmplTRepo;
import com.loan.main.repository.LoanTRepo;
import com.loan.main.requestBean.LoanRequest;
import com.loan.main.requestBean.LoanRequestFields;
import com.loan.main.responseBean.LoanResponseFields;


@Service
public class LoanDataTransformationImpl implements LoanDataTransformation{
	
	@Autowired
	LoanTRepo loanTRepo; // Inject loanTRepo
	@Autowired
	EmplTRepo emplTRepo; // Inject loanTRepo

	private static final Logger logger = LoggerFactory.getLogger(System.class);
	
	@Override
	public void loanDataRequestTransform(LoanRequest loanRequest, LoanResponseFields loanResponseFields) {
		// TODO Auto-generated method stub
		
		
		
		LoanT loanT = new LoanT();
		LoanRequestFields loanRequestFields = loanRequest.getLoanRequestFields();
		createLoanT(loanRequestFields, loanT);
	}

	private void createLoanT(LoanRequestFields loanRequestFields, LoanT loanT) {
		// TODO Auto-generated method stub
		try {
			
			Timestamp timestamp = new  Timestamp(new java.util.Date().getTime());

			loanT.setLoan_amt(loanRequestFields.getLoan_amt());
			loanT.setLoan_tenure(loanRequestFields.getLoan_tenure());
			loanT.setEmi_amt(loanRequestFields.getEmi_amt());					
			loanT.setStatus(1);
			
			loanT = loanTRepo.save(loanT);

		} catch (Exception e) {

			logger.error("LoanDataTransformationImpl:following error occurred in the createLoanT() function :", e);
		}
		
	}

//	@Override
//	public LoanT getLoanDetailsByLoanId(int loanId, LoanResponseFields loanResponseFields) {
//		// TODO Auto-generated method stub
//		LoanT loanT = null;
//		
//		try {
//
//			 loanT = loanTRepo.findByLoanId(loanId);
////			 emplTRepo.findByLoanId(loanId);
//			
//			
////			loanResponseFields.setResponse(200);
////			loanResponseFields.setStatus("success");
//
//
//		} catch (Exception e) {
//
//			logger.error("UserDataTransformationImpl:following error occurred in the etUserDetailsByUserId function :", e);
//		}
//		return loanT;
//	}
	
	

}
