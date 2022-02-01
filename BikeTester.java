package com.xworkz.oops.encapsulation;

public class BikeTester {

	public static void main(String[] args) {
		Bike bike = new Bike();
		
		bike.setByType("geared");
		String type =bike.getByType();
		System.out.println(type);
		
		bike.setByColour("blue");
		String colour =bike.getByColour();
		System.out.println(colour);
		
		bike.setBynoOfWheels(2);
		int wheels =bike.getBynoOfWheels();
		System.out.println(wheels);
		
		bike.setByName("wildcraft");
		String name =bike.getByName();
		System.out.println(name);
		
		bike.setByPrice(130000);
		int price =bike.getByPrice();
		System.out.println(price);
		
		bike.setByengineCapacity(150);
		int engineCapacity =bike.getByengineCapacity();
		System.out.println(engineCapacity);
		
		byte rate=10;
		bike.setByRating(rate);
		byte rating =bike.getByRating();
		System.out.println(rating);
		
		bike.setByfuelCapacity(12);
		int fuelCapacity =bike.getByfuelCapacity();
		System.out.println(fuelCapacity);
		
		bike.setByTopSpeed(200);
		int speed =bike.getByTopSpeed();
		System.out.println(speed);
		

		byte gear=5;
		bike.setByGears(gear);
		byte gears =bike.getByGears();
		System.out.println(gears);

	}

}
