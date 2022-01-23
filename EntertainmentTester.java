class EntertainmentTester{
	public static void main(String[] args){
		EntertainmentOperation op=new EntertainmentOperation();
	
		Entertainment ops=new Entertainment("movie",2.15f,true);
		Entertainment ops1=new Entertainment("game",3.5f,true);
		Entertainment ops2=new Entertainment("dance",2.19f,true);
		
		op.add(0,ops);
		op.add(1,ops1);
		op.add(2,ops2);
		op.printAll();
		op.updatebyname(1.99f,"movie");
		op.printAll();
	}
}