package com.example.demo.entities;

public class Product {
	private String productId, productName, thumbnail, description, shortDescription;
	private float price, productRatings;
	private boolean isActive;
	private long bigImage;
	
	public Product(String productId, String productName, String thumbnail, String description, String shortDescription,
			float price, float productRatings, boolean isActive, long bigImage) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.thumbnail = thumbnail;
		this.description = description;
		this.shortDescription = shortDescription;
		this.price = price;
		this.productRatings = productRatings;
		this.isActive = isActive;
		this.bigImage = bigImage;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getProductRatings() {
		return productRatings;
	}
	public void setProductRatings(float productRatings) {
		this.productRatings = productRatings;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public long getBigImage() {
		return bigImage;
	}
	public void setBigImage(long bigImage) {
		this.bigImage = bigImage;
	}

}
