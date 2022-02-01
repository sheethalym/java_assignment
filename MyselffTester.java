package com.xworkz.oops.encapsulation;

public class MyselfTester {

	public static void main(String[] args) {
		Myself myself = new Myself();
		
		myself.setByName("sheethal");
		String name=myself.getByName();
		System.out.println(name);
		
		myself.setByHeight(174);
		int height =myself.getByHeight();
		System.out.println(height);
		
		byte agge=23;
		myself.setByAge(agge);
		byte age =myself.getByAge();
		System.out.println(age);
		
		myself.setByPhno(8073668718l);
		long phno =myself.getByPhno();
		System.out.println(phno);
		
		myself.setByBirthYear(1998);
		int birthYear =myself.getByBirthYear();
		System.out.println(birthYear);
		
		short idd=17;
		myself.setById(idd);
		int id =myself.getById();
		System.out.println(id);
		
		myself.setByFavouriteGame("cricket");
		String favouriteGame =myself.getByFavouriteGame();
		System.out.println(favouriteGame);
		
		myself.setByFood("eggrice");
		String food =myself.getByFood();
		System.out.println(food);
		
		myself.setByBankbal(144);
		int bankbal =myself.getByBankbal();
		System.out.println(bankbal);
		
		myself.setBySalary(13500);
		int salary =myself.getBySalary();
		System.out.println(salary);

	}

}
