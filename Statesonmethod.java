class Statesonmethod{
	static String []state={"karnataka","tamil nadu","goa","punjab","kerala","rajasthan","orisa"};
	static void states(){
		for(int index=0;index<state.length;index=index+1){
			System.out.println(state[index]);
		}
	}
	public static void main(String[] args){
		states();
			System.out.println();
		 state[1]="gujurat";
		 states();
	}
}