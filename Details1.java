class Details1{
	static String []names={"null", "null", "null", "null","null"};
	static void printAll(){
		for(int index=0;index<names.length;index++){
			System.out.println(names[index]);
		}
	}
	static void add(int oldNameindex, String newName){
		names[oldNameindex]=newName;
	}
	static void delete(String nam,String name){
		for(int index=0;index<names.length;index++){
			if(nam.equals(names[index])){
				names[index]=name;
			}
		}
}
}