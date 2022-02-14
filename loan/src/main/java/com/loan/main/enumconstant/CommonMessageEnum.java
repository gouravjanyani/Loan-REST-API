package com.loan.main.enumconstant;

public enum CommonMessageEnum {
	
	RECORD_INSERT_SUCCESS("Record successfully Inserted"),
	RECORD_INSERT_ERROR(" Error inserting user record"),
	DATA_FETCHED_SUCCESSFULLY("data fetched successfully"),
	DATA_FETCHED_FAILED("Error fetching data");
	
String value;
	
	CommonMessageEnum(String value)
	{
		this.value = value;
	}
	
	public String getValue()
	{
		return value;
	}
}
