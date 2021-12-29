class Vegetables{
	static String []names={"tamato","patato","orion","carrot","chilli","radish"};
	static void market(){
		for(int index=0;index<names.length;index=index+1){
			System.out.println(names[index]);
		}
	}
	public static void main(String[] args){
		market();
			System.out.println();
		 names[1]="brinjal";
		 market();
	}
}