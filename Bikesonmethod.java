class Bikesonmethod{
	static String []names={"yamaha","r15","honda","ktm","royal enfield","apache","suzuki"};
	static void showroom(){
		for(int index=0;index<names.length;index=index+1){
			System.out.println(names[index]);
		}
	}
	public static void main(String[] args){
		showroom();
			System.out.println();
		 names[2]="cbr";
		 showroom();
	}
}