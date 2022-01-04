class RocketsBehaviourstester{
	public static void main(String[] args){
		RocketsBehaviours.travels();
		byte planet = 8;
		RocketsBehaviours.travels(planet);
		int num =4;String mars="fourth";
		RocketsBehaviours.travels(num,mars);
		String venus="secondplanet";int number=2;
		RocketsBehaviours.travels(venus,number);
		System.out.println("==============================================");
		RocketsBehaviours.launchsite();
		byte launchno = 1;
		RocketsBehaviours.launchsite(launchno);
		int no=2;String platform="site";
		RocketsBehaviours.launchsite(no,platform);
		String platform1="newplatform";int siteno=3;
		RocketsBehaviours.launchsite(platform1,siteno);
		System.out.println("==============================================");
		RocketsBehaviours.fuels();
		byte price=99;
		RocketsBehaviours.fuels(price);
		int money=199;String bunk="location";
		RocketsBehaviours.fuels(money,bunk);
		String petrol="fuel";int amount=100;
		RocketsBehaviours.fuels(petrol,amount);
		System.out.println("==============================================");
		RocketsBehaviours.names();
		byte code = 56;
		RocketsBehaviours.names(code);
		int pincode=560056;String headquarters="bengaluru";
		RocketsBehaviours.names(pincode,headquarters);
		String quarters="place";int pin=78;
		RocketsBehaviours.names(quarters,pin);
		System.out.println("==============================================");
		RocketsBehaviours.distance();
		byte km= 19;
		RocketsBehaviours.distance(km);
		int meter= 468733; String path="moon";
		RocketsBehaviours.distance(meter,path);
		String route="earthtomoon";int speed = 1000000;
		RocketsBehaviours.distance(route,speed);
	}
}