package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	private enum ORDERSTATUS {
		PLACED, SHIPPED, CLOSED, CANCELLED, REJECTED, RETURNED, REPLACED;
	}
	@Id
	private int OrderNumber,customerId;
	private String storeId, storeName, storeAddress, customerEmail, billingAddress,
			billingPhoneNumber, shippingAddress, shippingPhoneNumber, channel;
	private Date lastUpdate, lastUpdateBy, orderDate;
	private Long orderAmount;
	private ORDERSTATUS orderstatus;

	public Order() {

	}

	public Order(int orderNumber, String storeId, String storeName, String storeAddress, int customerId,
			String customerEmail, String billingAddress, String billingPhoneNumber, String shippingAddress,
			String shippingPhoneNumber, String channel, Date lastUpdate, Date lastUpdateBy, Date orderDate,
			Long orderAmount, ORDERSTATUS orderstatus) {
		OrderNumber = orderNumber;
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.customerId = customerId;
		this.customerEmail = customerEmail;
		this.billingAddress = billingAddress;
		this.billingPhoneNumber = billingPhoneNumber;
		this.shippingAddress = shippingAddress;
		this.shippingPhoneNumber = shippingPhoneNumber;
		this.channel = channel;
		this.lastUpdate = lastUpdate;
		this.lastUpdateBy = lastUpdateBy;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.orderstatus = orderstatus;
	}

	public ORDERSTATUS getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(ORDERSTATUS orderstatus) {
		this.orderstatus = orderstatus;
	}

	public int getOrderNumber() {
		return OrderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		OrderNumber = orderNumber;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getBillingPhoneNumber() {
		return billingPhoneNumber;
	}

	public void setBillingPhoneNumber(String billingPhoneNumber) {
		this.billingPhoneNumber = billingPhoneNumber;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getShippingPhoneNumber() {
		return shippingPhoneNumber;
	}

	public void setShippingPhoneNumber(String shippingPhoneNumber) {
		this.shippingPhoneNumber = shippingPhoneNumber;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
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

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

}
