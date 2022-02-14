package com.loan.main.model;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

@Entity(name = "sys_user_t")
public class UserT {

	@Id
	@SequenceGenerator(name = "userid_sequence",sequenceName = "userid_sequence",allocationSize = 1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "userid_sequence")
	@Column(name = "user_id")
	private int user_id;

	@NotNull
	@Column(name = "fname",length = 50)
	private String first_name;

	@NotNull
	@Column(name = "lname",length = 50)
	private String last_name;

	@NotNull
	@Column(name = "email",length = 50)
	private String email;
	
	@NotNull
	@Column(name = "mobile",length = 50)
	private String mobile;
	
	
	@Column(name = "dob",length = 50)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateOfBirth;
	
	@NotNull
	@Column(name = "city",length = 50)
	private String city;
	
	@NotNull
	@Column(name = "gender",length = 6)
	private char gender;

	@NotNull
	@Column(name = "status", nullable = false)
	private int status;

}