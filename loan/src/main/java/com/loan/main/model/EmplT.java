package com.loan.main.model;

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

@Entity(name = "sys_emp_t")
public class EmplT {
	
	@Id
	@Column(name = "emp_id")
	private int emp_id;

	@Column(name = "loan_id")
	private int loan_id;
	
	@NotNull
	@Column(name = "employer_catg",length = 50)
	private String employer_catg;
	
	@NotNull
	@Column(name = "Industry",length = 50)
	private String Industry;
	
	@NotNull
	@Column(name = "company_name",length = 50)
	private String company_name;
	
	@NotNull
	@Column(name = "salary_amt")
	private int salary_amt;
	
	@NotNull
	@Column(name = "status", nullable = false)
	private int status;
	
//	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinColumn(name = "loan_id")
//	private LoanT loanT;
}
