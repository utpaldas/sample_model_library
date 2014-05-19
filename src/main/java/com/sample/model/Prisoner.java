package com.sample.model;

public class Prisoner {

	private long id;

	private long cellNumber;
	
	private String firstName;

	private String lastName;

	public Prisoner() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public long getCellNumber() {
		return cellNumber;
	}
	
	public void setCellNumber(long cellNumber) {
		this.cellNumber = cellNumber;
	}

}
