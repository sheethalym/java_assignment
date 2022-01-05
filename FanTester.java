class FanTester{
	public static void main(String[] args){
		Fan fan= new Fan();
		System.out.println(fan.brand+"\t"+fan.price+"\t"+fan.quality+"\t"+fan.type+"\t"+fan.blade);
		Fan fan1=new Fan("usha",999,"good","tablefan",3);
		System.out.println("fan brand name:"+fan1.brand+"\t"+"price:"+fan1.price+"\t"+"quality:"+fan1.quality+"\t"+"type:"+fan1.type+"\t"+"no of blade:"+fan1.blade);
		Fan fan2=new Fan("usha",599,"average","tablefan",3);
		System.out.println("fan brand name:"+fan2.brand+"\t"+"price:"+fan2.price+"\t"+"quality:"+fan2.quality+"\t"+"type:"+fan2.type+"\t"+"no of blade:"+fan2.blade);
		Fan fan3=new Fan("bajaj",749,"good","ceiling fan",4);
		System.out.println("fan brand name:"+fan3.brand+"\t"+"price:"+fan3.price+"\t"+"quality:"+fan3.quality+"\t"+"type:"+fan3.type+"\t"+"no of blade:"+fan3.blade);
		Fan fan4=new Fan("usha",500);
		System.out.println("fan brand name:"+fan4.type+"\t"+"price:"+fan4.price);
		Fan fan5=new Fan("bajaj",1000);
		System.out.println("fan brand name:"+fan5.type+"\t"+"price:"+fan5.price);
	}
}