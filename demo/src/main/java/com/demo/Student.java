package com.demo;

import org.apache.johnzon.mapper.JohnzonProperty; 

public class Student {
	@JohnzonProperty("std_id") 
	private int stdId;
	
	@JohnzonProperty("std_name") 
	private String stdName;
	
	@JohnzonProperty("std_status") 
	private boolean stdStatus;
	
	
	public Student(int stdId, String stdName, boolean stdStatus) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdStatus = stdStatus;
	}
	
	public int getStdId() {
		return stdId;
	}
	
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	
	public String getStdName() {
		return stdName;
	}
	
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	public boolean isStdStatus() {
		return stdStatus;
	}
	public void setStdStatus(boolean stdStatus) {
		this.stdStatus = stdStatus;
	}
	
	
}
