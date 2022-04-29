package com.example.demo.entities;

public class Inventory {
	private String productId, storeId;
	private int quantity;

	public Inventory(String productId, String storeId, int quantity) {
		super();
		this.productId = productId;
		this.storeId = storeId;
		this.quantity = quantity;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
