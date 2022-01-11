class DetailsTester{
	public static void main(String []args){
		
		Details detail[]=new Details[5];
		
		Details detail1=new Details(17,"sheethal","sheethal.xworkz@gmail.com",8073668718l,23);
		Details detail2=new Details(10 ,"naveen","naveengr.xworkz@gmail.com",8147214046l,23);
		Details detail3=new Details(1,"rana","akshat.xworkz@gmail.com",9567456764l,23);
		Details detail4=new Details(4,"bharat","bharataj2211.xworkz@gmail.com",8536782541l,23);
		Details detail5=new Details(26,"hemanth","hemanth8183.xworkz@gmail.com",8091267840l,23);
		
		detail[0]=detail1;
		detail[1]=detail2;
		detail[2]=detail3;
		detail[3]=detail4;
		detail[4]=detail5;
		for(int index=0;index<detail.length;index++){
			System.out.println(detail[index].id+"\t"+detail[index].name+"\t"+detail[index].email+"\t"+detail[index].number+"\t"+detail[index].age);
		}
		System.out.println();
		Details1.printAll();
		Details1.add(0,"sheethal");
		Details1.add(1,"naveen");
		Details1.add(2,"rana");
		Details1.add(3,"bharat");
		Details1.add(4,"hemanth");
		Details1.printAll();
		System.out.println();
		Details1.delete("naveen",null);
		Details1.printAll();
		Details1.names.Arrayutils.remove(names,0);
	}
}