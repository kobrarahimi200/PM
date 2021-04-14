package com.kobra.models;

public class DigitalBook implements Book {
	private int pages;
	private String name;
	private String author;
	private String publisher;
	private double price;
	private String productID;
	private double size;
	private String url;
	
	public DigitalBook(String productID , String name, int pages, String author, String publisher, double price, double size, String url ) {
		super();
		this.pages = pages;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.productID = productID;
		this.size = size;
		this.url = url;
	}
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getproductID() {
		return productID;
	}

	public void setproductID(String productID) {
		this.productID = productID;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public int sendBack() {
		return (int) this.price / 132;
	}
	
}
