package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private String code;
	private String name;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
	public Country() {
		
		LOGGER.info("Inside Country Constructor.");
	}

	public String getCode() {
		LOGGER.debug("Getting Code : ",code);
		return code;
	}

	public void setCode(String code) {
		LOGGER.debug("Setting Code : ",code);
		this.code = code;
	}

	public String getName() {
		LOGGER.debug("Getting Name : ",name);
		return name;
	}

	public void setName(String name) {
		LOGGER.debug("Setting Name : ",name);
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}

}
