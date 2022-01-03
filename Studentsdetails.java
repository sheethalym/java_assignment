class Studentsdetails{
	static String []names={"sheethal","rana","naveen","bharat","hemanth","anita","deepa","harshith","mahesh","radhika","rani","santosh","shankar","soumya","ullas","umesh","arun","shweta","muskan","prabhu","akshay","lakappa","prashanth","mohan"};
	static void printAll(){
		for(int index = 0;index<names.length;index=index+1){
			System.out.println(names[index]);
		}
	}
	static void updatenames(String oldname, String newname){
		for(int index=0;index<names.length;index++){
			if(oldname.equals(names[index])){
				names[index]=newname;
			}
		}
		
	}
	
}