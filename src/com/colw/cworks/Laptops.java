package com.colw.cworks;

public class Laptops {
	
	String brand;
	long price;
	float weight;
	boolean touch_Interface;
	int ram_Size;
	int internal_Storage;
	
	public String toString() {
		return " "+this.brand+" - "+this.price+" - "+this.weight+" - "+this.touch_Interface+" - "
				+this.ram_Size+" - "+this.internal_Storage;
		
	}
	
	public Laptops(String brand, long price, float weight, boolean touch_Interface, int ram_Size, int  internal_Storage) {
	
		this.brand = brand;
		this.price = price;
		this.weight = weight;
		this.touch_Interface = touch_Interface;
		this.ram_Size = ram_Size;
		this.internal_Storage = internal_Storage;
	}
}
