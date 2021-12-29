class Coloursonmethod{
	static String []colour={"green","blue","silver","red","orange","yellow","white"};
	static void colours(){
		for(int index=0;index<colour.length;index=index+1){
			System.out.println(colour[index]);
		}
	}
	public static void main(String[] args){
		colours();
			System.out.println();
		 colour[3]="gold";
		 colours();
	}
}