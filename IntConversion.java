class IntConversion{
	public static void main(String[] args){
		//narrowing conversion
		int bankbal=56789;
		byte bal=(byte)bankbal;
		System.out.println(bal);
		//narrowing conversion
		int bankbal1=4655;
		short bal1=(short)bankbal1;
		System.out.println(bal1);
		//widening conversion
		int bankbal2=54454;
		long bal2=bankbal2;
		System.out.println(bankbal2);
		//widening conversion
		int bankbal3=6646;
		float bal3=bankbal3;
		System.out.println(bankbal3);
		//widening conversion
		int bankbal4=98887;
		double bal4=bankbal4;
		System.out.println(bankbal4);
		//narrowing conversion
		int bankbal5='7';
		char bal5=(char)bankbal5;
		System.out.println(bankbal5);
		
	}
}