class LongConversion{
	public static void main(String[] args){
		//narrowing conversion
		long phno=9907787878l;
		byte number=(byte)phno;
		System.out.println(number);
		//narrowing conversion
		long phno1=8997765678l;
		short number1=(short)phno1;
		System.out.println(number1);
		//narrowing conversion
		long phno2=8975674325l;
		int number2=(int)phno2;
		System.out.println(phno2);
		//widening conversion
		long phno3=6646567676l;
		float number3=phno3;
		System.out.println(phno3);
		//widening conversion
		long phno4=9888767876l;
		double number4=phno4;
		System.out.println(phno4);
		//narrowing conversion
		long phno5='7';
		char number5=(char)phno5;
		System.out.println(phno5);
		
	}
}