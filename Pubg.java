class Pubg{
	static String []bgmiNames={"ryuga", "nemo","akshath","charlie","bharat","aries","null"};
	//constructor
	int num;
	String character;
	String gunName;
	float kd;
	Pubg(){
		System.out.println("default values");
	}
	Pubg(int numof){
		num=numof;
	}
	Pubg(int num1,String character1){
		num=num1;
		character=character1;	
	}
	Pubg(float kd2,String gunName2){
		kd=kd2;
		gunName=gunName2;
	}
	
	static void bgmi(){
		for(int index =0;index<bgmiNames.length;index++){
			System.out.println(bgmiNames[index]);
		}
	}
	static void addName(int old,String newnam){
		bgmiNames[old]=newnam;
	}
	static void updateNames(String oldname, String newname){
		for(int index=0;index<bgmiNames.length;index++){
			if(oldname.equals(bgmiNames[index])){
				bgmiNames[index]=newname;
			}
		}
	}
		static void change(){
			//for(int index=0;index<bgmiNames.length;index++){
				bgmiNames[2]="striker";
			
		}
		static void getByIndex(int no){
			//for(int index=0;index<bgmiNames.length;index++){
				System.out.println(bgmiNames[no]);
			}
			//static void searchByName(String nam){
			//	for(int index=0;index<bgmiNames.length;index++){
				//System.out.println(bgmiNames[index]);
				}
			//}
		//}//
		
		
	
