package com.sample.model;

public class Address {

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public long id;

	public String streetName;

	public String zipCode;

	public String city;

	public String countryCode;

	public AddressTypeEnum type;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public AddressTypeEnum getType() {
		return type;
	}

	public void setType(AddressTypeEnum type) {
		this.type = type;
	}

	public String toString() {
		return this.getStreetName() + ", " + this.getCity() + ", "
				+ this.getZipCode() + ", " + this.getCountryCode();
	}

}
