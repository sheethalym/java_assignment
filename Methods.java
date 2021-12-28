class Methods{
	static void factorial(){
		int fact=1;
		for(int num=1;num<=5;num=num+1){
			fact=fact*num;
		}
		System.out.println(fact);
	}
	static void factorialseries(){
				int fact=1;
		for(int num =1; num<=6;num=num+1){
			fact= fact*num;
			System.out.println(fact);
		}	
		
		
	}
	static void fabonic(){
		int num1=0;
		int num2=1;
		int num3=0;
		for(int num=1;num<=10;num=num+1){
			num3=num1+num2;
			num1=num2;
			num2=num3;
			
			System.out.print(num1+" ");
			
		}
	
	}
	static void years(){
		int year =2000;
		if(year%4==0){
		
	
		if(year%100==0){
		
		
		if(year%400==0){
			System.out.println("\nis a leap year");
		}
			
		}
		}
		else{
			System.out.println("\nis not a leap year");
		}
	}
	public static void main(String[] args){
		factorial();
		factorialseries();
		fabonic();
		years();
	}
}