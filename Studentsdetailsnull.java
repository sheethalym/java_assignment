class Studentsdetailsnull{
	static String []name={"null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null"};
	static void printAll(){
		for(int index = 0;index<name.length;index++){
			System.out.println(name[index]);
		}
	}
	static void updatename(int oldname, String newname){
				name[oldname]=newname;
			}
	static void update(){
		for(int index=0;index<name.length;index++){
		name[2]="sheetu";
		}
	}	
	}
	
