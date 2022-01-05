class MyselfTester{
	public static void main(String[] args){
		Myself myself=new Myself();
		System.out.println(myself.height+"\t"+myself.weight+"\t"+myself.atitude+"\t"+myself.graduation+"\t"+myself.age);
		Myself myself1=new Myself(177,67,"good","BE graduate",23);
		System.out.println("height:"+myself1.height+"\t"+"weight:"+myself1.weight+"\t"+"Atitude:"+myself1.atitude+"\t"+"graduation:"+myself1.graduation+"\t"+"age:"+myself1.age);
		Myself myself2=new Myself(177,67,"good","BE mechanical graduate",23);
		System.out.println("height:"+myself2.height+"\t"+"weight:"+myself2.weight+"\t"+"Atitude:"+myself2.atitude+"\t"+"graduation:"+myself2.graduation+"\t"+"age:"+myself2.age);
		Myself myself3=new Myself(177,67,"good","BE mechanical graduate",24);
		System.out.println("height:"+myself3.height+"\t"+"weight:"+myself3.weight+"\t"+"Atitude:"+myself3.atitude+"\t"+"graduation:"+myself3.graduation+"\t"+"age:"+myself3.age);
		Myself myself4=new Myself(65,23);
		System.out.println("weight:"+myself4.weight+"\t"+ "age:"+myself4.age);
		Myself myself5=new Myself(66,24);
		System.out.println("weight:"+myself5.weight+"\t"+ "age:"+myself5.age);
	}
}