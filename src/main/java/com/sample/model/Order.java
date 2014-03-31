package com.sample.model;

import java.util.Date;
import java.util.Set;

public class Order {

	public long orderId;

	public Date orderDate;

	public OrderStatusEnum orderStatus;

	public Set<LineItem> lineItems;

	public Customer customer;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Set<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(Set<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public OrderStatusEnum getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatusEnum orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String toString() {
		String str = "Order Id: " + this.getOrderId() + "Order Date: "
				+ this.getOrderDate().toString() + "\n Shipping Address: "
				+ "\n Line Items: " + this.getLineItems().toString();
		return str;
	}

}
