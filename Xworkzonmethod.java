class Xworkzonmethod{
	static String []names={"naveen","rana","bharat","hemanth","prabu","santhosh"};
	static void students(){
		for(int index=0;index<names.length;index=index+1){
			System.out.println(names[index]);
		}
	}
	public static void main(String[] args){
		students();
			System.out.println();
		 names[4]="raj";
		 students();
	}
}