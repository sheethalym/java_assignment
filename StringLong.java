class StringLong{
	public static void main(String[] args){
		for(int index=0;index<args.length;index++){
			long phno=Long.parseLong(args[index]);
			System.out.println(phno);
		}
	}
}