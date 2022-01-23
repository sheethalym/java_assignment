class StringShort{
	public static void main(String[] arg){
		for(int index=0;index<arg.length;index++){
			short id=Short.parseShort(arg[index]);
			System.out.println(id);
		}
	}
}