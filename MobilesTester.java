package com.xworkz.oops.encapsulation;

public class MobilesTester {
	public static void main(String[] args) {
		Mobiles mobiles=new Mobiles();
		
		mobiles.setByBrand("Realme");
		String brand =mobiles.getByBrand();
		System.out.println(brand);
		
		mobiles.setByColour("red");
		String colour = mobiles.getByColour();
		System.out.println(colour);
		
		mobiles.setByPrice(12599);
		int price =mobiles.getByPrice();
		System.out.println(price);
		
		byte ramm=6;
		mobiles.setByRam(ramm);
		byte ram =mobiles.getByRam();
		System.out.println(ram);
		
		mobiles.setByBattery(5000);
		int battery =mobiles.getByBattery();
		System.out.println(battery);
		
		byte simm=2;
		mobiles.setBySim(simm);
		byte sim =mobiles.getBySim();
		System.out.println(sim);
		
		mobiles.setByquality("good");
		String quality =mobiles.getByquality();
		System.out.println(quality);
		
		mobiles.setByStorage(64);
		int storage =mobiles.getByStorage();
		System.out.println(storage);
		
		mobiles.setByCamera(24);
		int camera =mobiles.getByCamera();
		System.out.println(camera);
		
		mobiles.setByWarranity(18);
		int months = mobiles.getByWarranity();
		System.out.println(months);

	}

}
