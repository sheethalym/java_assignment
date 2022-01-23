class StringFloat{
	public static void main(String[] args){
		for(int index=0;index<args.length;index++){
			float runrate=Float.parseFloat(args[index]);
			System.out.println(runrate);
		}
	}
}