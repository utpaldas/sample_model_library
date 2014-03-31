package com.sample.model;

public class LineItem {

	public long id;

	public String productName;

	public int quantity;

	public double unitPrice;

	public long lineOrderId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;

	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public long getLineOrderId() {
		return lineOrderId;
	}
	
	public void setLineOrderId(long lineOrderId) {
		this.lineOrderId = lineOrderId;
	}

	public String toString() {
		return "Id: " + this.getId() + ", Description: "
				+ this.getProductName() + ", Quantity: " + this.getQuantity()
				+ ", Unit Price: $" + this.getUnitPrice();
	}
}
