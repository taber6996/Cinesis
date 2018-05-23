package com.cinesis.model;


import java.io.Serializable;

public class PersonBeanModel implements Serializable{
	/**
	 * 
	 */
	private String name = null;
	private String email = null;
	
	public PersonBeanModel() {
        // Default constructor.
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void doSomething() {
		setName("["+getName()+"]");
		setEmail("["+getEmail()+"]");
	}
}
