class Maruthi{
	static String []menu={"idli","vade","dose","upittu","palav","chapathi","roti"};
	static void food(){
		for(int index=0;index<menu.length;index=index+1){
			System.out.println(menu[index]);
		}
	}
	public static void main(String[] args){
		food();
			System.out.println();
		 menu[1]="briyani";
		 food();
	}
}