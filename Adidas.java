class Adidas{
	int amount;
	short size;
	byte tax;
	String colour;
	String item;
	Adidas(){
		System.out.println("details of adidas");
	}
	Adidas(int amountof,short sizeof,byte taxof,String colourof,String itemof){
		amount=amountof;
		size=sizeof;
		tax=taxof;
		colour=colourof;
		item = itemof;
	}
	Adidas(String items,int amounts){
		item=items;
		amount=amounts;
	}
	
	
	
}