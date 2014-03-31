package com.sample.model;

public class Employee extends Person {

	private long employeeId;

	private EmployeeTypeEnum role;
	
	private Address address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public EmployeeTypeEnum getRole() {
		return role;
	}

	public void setRole(EmployeeTypeEnum role) {
		this.role = role;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

}
