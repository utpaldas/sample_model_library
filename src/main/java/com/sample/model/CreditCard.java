package com.sample.model;

public class CreditCard extends BillingDetails {

	public long creditCardNumber;

	public Address billingAddress;

	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

}
