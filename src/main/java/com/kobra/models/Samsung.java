package com.kobra.models;

public class Samsung implements Mobile{
	private String name;
	private String productID;
	private int capacity;
	private double price;
	private CPU cpu;
	private Color color;
	private int gaurantee;
	private String url;
	
	public Samsung(String name, String productID, int capacity, double price, CPU cpu, String url) {
		super();
		this.name = name;
		this.productID = productID;
		this.capacity = capacity;
		this.price = price;
		this.cpu = cpu;
		this.url =url;
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
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void customize(int gaurantee, Color color) {
		this.setGaurantee(gaurantee);
		this.setColor(color);
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
	
	
}
