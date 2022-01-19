class FloatConversion{
	public static void main(String[] args){
		//narrowing conversion
		float runrate=1.23f;
		byte rr=(byte)runrate;
		System.out.println(rr);
		//narrowing conversion
		float runrate1=2.23f;
		short rr1=(short)runrate1;
		System.out.println(rr1);
		//narrowing conversion
		float runrate2=2.23f;
		int rr2=(int)runrate2;
		System.out.println(runrate2);
		//narrowing conversion
		float runrate3=2.138f;
		long rr3=(long)runrate3;
		System.out.println(runrate3);
		//widening conversion
		float runrate4=3.374f;
		double rr4=runrate4;
		System.out.println(runrate4);
		//narrowing conversion
		float runrate5='a';
		char rr5=(char)runrate5;
		System.out.println(runrate5);
		
	}
}