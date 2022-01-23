class StringByte{
	public static void main(String[] args){
		for(int index=0;index<args.length;index++){
			byte num=Byte.parseByte(args[index]);
			System.out.println(num);
		}
	}
}