package com.cg.streams;

public class Redcolor {
	String name;
	int price;
	String color;
	 
	public Redcolor(String name, int price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color=color;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;	
	}
	
	@Override
	public String toString() {
		return "Samecolor [name=" + name + ", price=" + price + ", color=" + color + "]";
	}

	
}
