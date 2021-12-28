class Fabonic{
	public static void main(String[] args){
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
}