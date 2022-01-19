class ByteConversion{
	public static void main(String[] args){
		//widening conversion
		byte id = 10;
		short num=id;
		//widening conversion
		byte num1=1;
		int number1=num1;
		//widening conversion
		byte num2=2;
		long number2=num2;
		//widening conversion
		byte num3=3;
		float number3=num3;
		//widening conversion
		byte num4=4;
		double number4=num4;
		
		//byte num5=true;
		//boolean number5=(boolean)num5;
		//narrowing conversion
		byte num6='6';
		char number6=(char)num6;
		
		System.out.println(id);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		//System.out.println(num5);
		System.out.println(num6);
		
	}
}