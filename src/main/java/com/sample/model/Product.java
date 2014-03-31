package com.sample.model;

import java.util.List;
import java.util.Set;

public class Product {

	public long productId;

	public String productName;

	public List<Store> storeAvailability;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setStoreAvailability(List<Store> storeAvailability) {
		this.storeAvailability = storeAvailability;
	}

	public List<Store> getStoreAvailability() {
		return storeAvailability;
	}

}
