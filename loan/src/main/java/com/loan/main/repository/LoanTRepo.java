package com.loan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.loan.main.model.LoanT;


public interface LoanTRepo extends JpaRepository<LoanT, Integer>{
	
	 @Query("from sys_loan_t WHERE loan_id=?1 and status = 1")
	    public LoanT findByLoanId(Integer loanId);

}
