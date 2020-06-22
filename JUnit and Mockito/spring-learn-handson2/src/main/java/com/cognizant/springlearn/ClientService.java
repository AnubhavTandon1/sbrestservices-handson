package com.cognizant.springlearn;

public class ClientService{
	private String eid;
	private String name;
	private ClientService(String eid,String name) {
	this.eid=eid;
	this.name=name;
	}
	private ClientService() {
		super();
	}
}
