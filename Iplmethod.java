class Iplmethod{
	static String []team={"rcb","rr","csk","mi","pk","dc","kkr"};
	static void franchise(){
		for(int index=0;index<team.length;index=index+1){
			System.out.println(team[index]);
		}
	}
	public static void main(String[] args){
		franchise();
			System.out.println();
		 team[2]="kongeru";
		 franchise();
	}
}