class ShortConversion{
	public static void main(String[] args){
		//narrowing conversion
		short id1=130;
		byte num1=(byte)id1;
		//widening conversion
		short id2=200;
		int num2=id2;
		//widening conversion
		short id3=300;
		long num3=id3;
		//widening conversion
		short id4=400;
		float num4=id4;
		//widening conversion
		short id5=500;
		double num5=id5;
		//narrowing conversion
		short id6='6';
		char num6=(char)id6;
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id3);
		System.out.println(id4);
		System.out.println(id5);
		System.out.println(id6);
	}
}