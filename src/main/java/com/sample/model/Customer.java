package com.sample.model;

public class Customer extends Person {

	public long customerId;

	public Address address;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String toString() {
		return "Customer Name: " + this.getFirstName() + " "
				+ this.getLastName() + ", Address: "
				+ this.getAddress().toString();
	}
}
