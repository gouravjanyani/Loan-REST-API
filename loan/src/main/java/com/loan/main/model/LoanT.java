package com.loan.main.model;



import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

@Entity(name = "sys_loan_t")
public class LoanT  {

	@Id
	@SequenceGenerator(name = "loanid_sequence",sequenceName = "loanid_sequence",allocationSize = 1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "loanid_sequence")
	@Column(name = "loan_id")
	private int loan_id;
	
	@NotNull
	@Column(name = "user_id")
	private int user_id;
	
	@NotNull
	@Column(name = "Loan_amt")
	private int Loan_amt;
	
	@NotNull
	@Column(name = "loan_tenure")
	private int loan_tenure;
	
	@NotNull
	@Column(name = "emi_amt")
	private int emi_amt;

	@NotNull
	@Column(name = "status", nullable = false)
	private int status;
	
//	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "loanT")
//	private EmplT emplT;
	
	

	
}