class DoubleConversion{
	public static void main(String[] args){
		//narrowing conversion
		double minutes=134.65;
		byte min=(byte)minutes;
		System.out.println(min);
		//narrowing conversion
		double minutes1=678.87;
		short min1=(short)minutes1;
		System.out.println(min1);
		//narrowing conversion
		double minutes2=76.976;
		int min2=(int)minutes2;
		System.out.println(minutes2);
		//narrowing conversion
		double minutes3=235.75;
		long min3=(long)minutes3;
		System.out.println(minutes3);
		//narrowing conversion
		double minutes4=578.78;
		float min4=(float)minutes4;
		System.out.println(minutes4);
		//narrowing conversion
		double minutes5='9';
		char min5=(char)minutes5;
		System.out.println(minutes5);
		
	}
}