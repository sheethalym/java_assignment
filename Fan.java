class Fan{
	String brand;
	int price;
	String quality;
	String type;
	int blade;
	Fan(){
		System.out.println("defaults values for fan");
	}
	Fan(String brandof,int priceof,String qualityof, String typeof,int bladeof){
		brand = brandof;
		price=priceof;
		quality=qualityof;
		type=typeof;
		blade=bladeof;
	}
	Fan(String type1,int price1){
		type=type1;
		price=price1;
	}
}