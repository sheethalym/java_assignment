package com.xworkz.oops.encapsulation;

public class BagTester {

	public static void main(String[] args) {
		Bag bag = new Bag();
		
		bag.setByType("laptop bag");
		String typee =bag.getByType();
		System.out.println(typee);
		
		bag.setByColour("black");
		String colour = bag.getByColour();
		System.out.println(colour);
		
		bag.setBynoOfZip(4);
		int zip = bag.getBynoOfZip();
		System.out.println(zip);
		
		byte p=2;
		bag.setBynoOfPockets(p);
		byte pockets = bag.getBynoOfPockets();
		System.out.println(pockets);
		
		bag.setByPrice(1299);
		int price = bag.getByPrice();
		System.out.println(price);
		
		bag.setBybagName("wildcraft");
		String name =bag.getBybagName();
		System.out.println(name);
		
		bag.setByquality("good");
		String quality =bag.getByquality();
		System.out.println(quality);
		
		byte cap=22;
		bag.setByCapacity(cap);
		byte capacity = bag.getByCapacity();
		System.out.println(capacity);
		
		bag.setBywaterProof(true);
		boolean waterProof =bag.getBywaterProof();
		System.out.println(waterProof);
		
		bag.setBywarranityYear(2);
		int year = bag.getBywarranityYear();
		System.out.println(year);

	}

}


