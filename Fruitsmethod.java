class Fruitsmethod{
	static String []names={"mango","apple","lemon","orange","pineappple","banana","papaya"};
	static void shop(){
		for(int index=0;index<names.length;index=index+1){
			System.out.println(names[index]);
		}
	}
	public static void main(String[] args){
		shop();
			System.out.println();
		 names[4]="watermelon";
		 shop();
	}
}