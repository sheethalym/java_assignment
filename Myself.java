class Myself{
	int height;
	int weight;
	String atitude;
	String graduation;
	int age;
	Myself(){
		System.out.println("myself");
	}
	Myself(int heightof,int weightof,String atitudeof,String graduationof,int ageof){
		height=heightof;
		weight=weightof;
		atitude=atitudeof;
		graduation=graduationof;
		age=ageof;
	}
	Myself(int weight1,int age1){
		weight=weight1;
		age=age1;
	}
}