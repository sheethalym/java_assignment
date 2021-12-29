class Mobiles{
	static String []company={"realme","redmi","apple","samsung","nokia","vivo"};
	static void store(){
		for(int index=0;index<company.length;index=index+1){
			System.out.println(company[index]);
		}
	}
	public static void main(String[] args){
		store();
			System.out.println();
		 company[5]="oppo";
		 store();
	}
}