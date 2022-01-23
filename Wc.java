class Wc{
	public static void main(String[] args){
		String num1="20";
		byte age=Byte.parseByte(num1);
		System.out.println(age);
		
		String num2="19";
		short id=Short.parseShort(num2);
		System.out.println(id);
		
		String num3="18686";
		int bal=Integer.parseInt(num3);
		System.out.println(num3);
		
		String num4="8073668718";
		long phno= Long.parseLong(num4);
		System.out.println(num4);
		
		String num5= "4.56";
		float runrate= Float.parseFloat(num5);
		System.out.println(num5);
		
		String num6 = "3.14159265";
		double pi= Double.parseDouble(num6);
		System.out.println(num6);
		
		String value = "true";
		boolean statement= Boolean.parseBoolean(value);
		System.out.println(value);
		
		String name = "sheethal";
		char symbol = Char.parseChar(name);
		System.out.println(name);
	}
}