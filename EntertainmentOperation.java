class EntertainmentOperation{
	Entertainment details[]=new Entertainment[3];
	
	boolean add(int index, Entertainment ent){
		if(index<details.length){
			details[index]=ent;
			return true;
		}else{
			System.out.println("print values");
			return false;
		}
	}
	String printAll(){
		for(int index=0;index<details.length;index++){
			System.out.println(details[index].type+"\t"+details[index].duration+"\t"+details[index].interest);
		}
		return "Data is Added";
	}
	void updatebyname(float f, String ty){
		for(int index=0;index<details.length;index++){
			if(details[index]!=null){
				if(ty.equals(details[index].type))
					details[index].duration=f;
			}
		}
	}
}