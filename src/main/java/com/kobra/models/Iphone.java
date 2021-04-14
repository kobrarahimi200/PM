package com.kobra.models;

public class Iphone implements Mobile {
	private String name;
	private String productID;
	private int capacity;
	private double price;
	private Color color;
	private int gaurantee;
	private String url;
	
	public Iphone(String name, String productID, int capacity, double price, String url) {
		super();
		this.name = name;
		this.productID = productID;
		this.capacity = capacity;
		this.price = price;
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getproductID() {
		return productID;
	}
	public void setproductID(String productID) {
		this.productID = productID;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getGaurantee() {
		return gaurantee;
	}
	public void setGaurantee(int gaurantee) {
		this.gaurantee = gaurantee;
	}
	@Override
	public void customize(int gaurantee, Color color) {
		this.color = color;
		this.gaurantee = gaurantee;
	}
	
	
}
