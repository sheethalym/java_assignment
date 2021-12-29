class Country{
	static String []names={"india","south africa","sri lanka","pakisthan","nepal","england","greenland"};
	static void world(){
		for(int index=0;index<names.length;index=index+1){
			System.out.println(names[index]);
		}
	}
	public static void main(String[] args){
		world();
			System.out.println();
		names[2]="italy";
		world();
	}
}