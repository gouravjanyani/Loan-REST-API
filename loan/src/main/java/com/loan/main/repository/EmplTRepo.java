package com.loan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.loan.main.model.EmplT;


public interface EmplTRepo extends JpaRepository<EmplT, Integer>{
	
	 @Query("from sys_emp_t WHERE loan_id=?1")
	    public EmplT findByLoanId(Integer loanId);

}
