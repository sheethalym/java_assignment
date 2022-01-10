class PubgTester{
	public static void main(String[] player){
		int id[]={19,17,20,10,18};
		System.out.println(id[0]);
		System.out.println(player[0]);
		Pubg pubg=new Pubg();
		System.out.println(pubg.num+pubg.character+pubg.gunName+pubg.kd);
		Pubg pubg1=new Pubg(5768786);
		System.out.println();
		System.out.println("pubg id:"+pubg1.num);
		System.out.println();
		Pubg pubg2=new Pubg(57776789,"boy");
		System.out.println("pubg id:"+pubg2.num+"\t"+"character:"+pubg2.character);
		System.out.println();
		Pubg pubg3=new Pubg(3.89f,"M416");
		System.out.println("kd:"+pubg3.kd+"\t"+"gunName:"+pubg3.gunName);
		System.out.println();
		Pubg.bgmi();
		System.out.println();
		Pubg.addName(6,"lone");
		Pubg.bgmi();
		System.out.println();
		Pubg.updateNames("nemo","avatar");
		Pubg.bgmi();
		System.out.println();
		Pubg.change();
		Pubg.bgmi();
		System.out.println();
		Pubg.getByIndex(0);
		System.out.println();
		//Pubg.searchByName("charlie");
	}
}