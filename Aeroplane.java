class Aeroplane{
	String company;
	String colour;
	int passenger;
	
	Aeroplane(){
		this("company");
		System.out.println("zero parameters");
	}
	Aeroplane(String company){
		this.company=company;
		System.out.println("one parameters");
	}
	Aeroplane(String company,String colour, int passenger){
		this.company=company;
		this.colour=colour;
		this.passenger=passenger;
	}
}