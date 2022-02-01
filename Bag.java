package com.xworkz.oops.encapsulation;

public class Bag {
	private String type;
	private String colour;
	private int noOfZip;
	private byte noOfPockets;
	private int price;
	private String bagName;
	private String quality;
	private byte capacity;
	private boolean waterProof;
	private int warranityYear;
	
	
	public Bag() {
		
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
	
	public void setBynoOfZip(int noOfZip) {
		this.noOfZip = noOfZip;
	}
	
	public int getBynoOfZip() {
		return noOfZip;
	}
	
	public void setBynoOfPockets(byte noOfPockets) {
		this.noOfPockets = noOfPockets;
	}
	
	public byte getBynoOfPockets() {
		return noOfPockets;
	}
	
	public void setByPrice(int price) {
		this.price = price;
	}
	
	public int getByPrice() {
		return price;
	}
	
	public void setBybagName(String bagName) {
		this.bagName=bagName;
	}
	
	public String getBybagName() {
		return bagName;
	}
	
	public void setByquality(String quality) {
		this.quality=quality;
	}
	
	public String getByquality() {
		return quality;
	}
	
	public void setByCapacity(byte capacity) {
		this.capacity = capacity;
	}
	
	public byte getByCapacity() {
		return capacity;
	}
	
	public void setBywaterProof(boolean waterProof) {
		this.waterProof = waterProof;
	}
	
	public boolean getBywaterProof() {
		return true ;
	}
	
	public void setBywarranityYear(int warranityYear) {
		this.warranityYear = warranityYear;
	}
	
	public int getBywarranityYear() {
		return warranityYear;
	}
}
