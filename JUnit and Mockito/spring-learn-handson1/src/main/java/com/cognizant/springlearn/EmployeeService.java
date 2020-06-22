package com.cognizant.springlearn;

public class EmployeeService {
	private String eid;
	private String name;
	private EmployeeService(String eid,String name) {
	this.eid=eid;
	this.name=name;
	}
	private EmployeeService() {
		super();
	}
}
