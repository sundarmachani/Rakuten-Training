package com.example.demo.entities;

import java.util.Date;

public class OrderItems {
	private enum STATUS {
		SHIPPED ,CLOSED, CANCELLED, REJECTED, RETURED, REPLACED
	}
	private Float price;
	private int quantity;
	private Date lastUpdate, lastUpdateBy;
	private STATUS status;
	private String orderNumber, productId, channel;
	
	public OrderItems() {
		
	}
	public OrderItems(Float price, int quantity, Date lastUpdate, Date lastUpdateBy, STATUS status, String orderNumber,
			String productId, String channel) {
		this.price = price;
		this.quantity = quantity;
		this.lastUpdate = lastUpdate;
		this.lastUpdateBy = lastUpdateBy;
		this.status = status;
		this.orderNumber = orderNumber;
		this.productId = productId;
		this.channel = channel;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public Date getLastUpdateBy() {
		return lastUpdateBy;
	}
	public void setLastUpdateBy(Date lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}

}
