package com.xworkz.oops.encapsulation;

public class Bike {
	private String type;
	private String colour;
	private int wheels;
	private String name;
	private int price;
	private int engineCapacity;
	private byte rating;
	private int fuelCapacity;
	private int topSpeed;
	private byte gears;
	
	public Bike() {
		
	}
	
	public void setByType(String type) {
		this.type=type;
	}
	
	public String getByType() {
		return type;
	}
	
	public void setByColour(String colour) {
		this.colour=colour;
	}
	
	public String getByColour() {
		return colour;
	}
	

	public void setBynoOfWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public int getBynoOfWheels() {
		return wheels;
	}
	
	public void setByName(String name) {
		this.name=name;
	}
	
	public String getByName() {
		return name;
	}
	
	public void setByPrice(int price) {
		this.price = price;
	}
	
	public int getByPrice() {
		return price;
	}
	
	public void setByengineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	public int getByengineCapacity() {
		return engineCapacity;
	}
	
	public void setByRating(byte rating) {
		this.rating = rating;
	}
	
	public byte getByRating() {
		return rating;
	}
	
	public void setByfuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	public int getByfuelCapacity() {
		return fuelCapacity;
	}
	
	public void setByTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getByTopSpeed() {
		return topSpeed;
	}
	
	public void setByGears(byte gears) {
		this.gears = gears;
	}
	
	public byte getByGears() {
		return gears;
	}

}
