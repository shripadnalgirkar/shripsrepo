package com.infy.spring.model;

public class Shop {

	String name;
	String id;	
	String staffName[];
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
	System.out.println("------getName------");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getStaffName() {
		return staffName;
	}
	public void setStaffName(String[] staffName) {
		this.staffName = staffName;
	}
	public Shop() {
	} 
	
}
