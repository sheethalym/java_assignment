class AeroplaneTester{
	public static void main(String[] args){
		Aeroplane aeroplane=new Aeroplane("air india","white",200);
		System.out.println(aeroplane.company+"\t"+aeroplane.colour);
		Aeroplane aeroplane1=new Aeroplane();
		//System.out.println(aeroplane);
		Aeroplane aeroplane2= new Aeroplane("king");
		System.out.println(aeroplane2.company);
	}
}