class AdidasTester{
	public static void main(String[] args){
		Adidas adidas=new Adidas();
		System.out.println(adidas.amount+ "\t"+adidas.size +"\t"+adidas.tax+"\t"+adidas.colour+"\t"+adidas.item);
		short size=8;byte tax=10;
		Adidas adi = new Adidas(1999,size,tax,"green","shoe");
		System.out.println("amount : "+adi.amount+ "\t"+"size of : "+adi.size+"\t"+"tax on amount : "+adi.tax +"\t"+"colour of product is : "+adi.colour+"\t"+"type:"+adi.item);
		Adidas adinew = new Adidas(999,size,tax,"blue","shirt");
		System.out.println("amount : "+adinew.amount+ "\t"+"size of : "+adinew.size+"\t"+"tax on amount : "+adinew.tax +"\t"+"colour of product is : "+adinew.colour+"\t"+"type:"+adi.item);
		Adidas newProduct=new Adidas("pullover",249);
		System.out.println("product :"+newProduct.item+"\t"+"amount:"+newProduct.amount);
		Adidas updateproduct=new Adidas("pullover",349);
		System.out.println("product:"+updateproduct.item+"\t"+"updated amount:"+updateproduct.amount);
		Adidas trend=new Adidas("trackpant",349);
		System.out.println("product:"+trend.item+"\t"+"updated amount:"+trend.amount);
		
	}
}