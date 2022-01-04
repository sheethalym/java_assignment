class Carsbehaviourstester{
	public static void main(String[] args){
		Carsbehaviours.Travel();
		byte names = 0;
		Carsbehaviours.Travel(names);
		int journey=100;String detail="details";
		Carsbehaviours.Travel(journey,detail);
		String destination = "mysore";int velocity=60;
		Carsbehaviours.Travel(destination,velocity);
		System.out.println("==============================================");
		Carsbehaviours.speed();
		byte km=100;
		Carsbehaviours.speed(km);
		int acceleration = 20; String path = "road";
		Carsbehaviours.speed(acceleration,path);
		String tour= "road";
		int litre = 1;
		Carsbehaviours.speed(tour,litre);
		System.out.println("==============================================");
		Carsbehaviours.music();
		byte rap=2;
		Carsbehaviours.music(rap);
		int length =3;String song ="old songs";
		Carsbehaviours.music(length,song);
		String sound="old";int seconds=4;
		Carsbehaviours.music(sound,seconds);
		System.out.println("==============================================");
		Carsbehaviours.activity();
		byte sleep =5;
		Carsbehaviours.activity(sleep);
		int tv=6;String movie="watch";
		Carsbehaviours.activity(tv,movie);
		String party="enjoy";int ride=7;
		Carsbehaviours.activity(party,ride);
		System.out.println("==============================================");
		Carsbehaviours.gears();
		byte number=8;
		Carsbehaviours.gears(number);
		int top =9;String high ="fast";
		Carsbehaviours.gears(top,high);
		String reverse ="backwards";int R=10;
		Carsbehaviours.gears(reverse,R);
	}
}