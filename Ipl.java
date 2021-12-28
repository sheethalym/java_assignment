class Ipl{
	      public static void main(String[] cricket){
		int match=0;
		for(int team=0;team<cricket.length;team++){
			if(match==4){
				System.out.println();
				match=0;



			}
				System.out.print(cricket[team] + " ");
				match= match+1;				
		
		}
	}
}