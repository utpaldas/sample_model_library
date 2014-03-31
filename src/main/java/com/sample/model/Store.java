package com.sample.model;

import java.util.List;

public class Store {

	public Store() {
		// TODO Auto-generated constructor stub
	}

	public long id;

	public String name;

	public Address address;

	public List<Product> productInventory;
	
	public Employee[] employees;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Product> getProductInventory() {
		return productInventory;
	}

	public void setProductInventory(List<Product> productInventory) {
		this.productInventory = productInventory;
	}
	
	public Employee[] getEmployees() {
		return employees;
	}
	
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public String toString() {
		return "Store Name: " + this.getName() + "Address: "
				+ this.getAddress().toString();
	}
}
