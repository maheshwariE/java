package cdc1;
interface Movable{
	void moveTo();
}
interface Liftable {
	void lift();
	
}
interface Scannable  extends Movable,Liftable{
	void scan();
}
class Rechargeable{
	void recharge() {
		System.out.println("This robot is recharable");
	}
}
class Robotics extends Rechargeable implements Scannable {
	public void moveTo() {
		System.out.println("This robot can move");
	}
	public void lift() {
		System.out.println("This robot can lift weight");
	}
	public void scan() {
		System.out.println("This robot can scan QR codes");
	}
	public void configure() {
		System.out.println("This robot is configurable");
	}
}


public class Test9 {

	public static void main(String[] args) {
		Robotics i=new Robotics();
		i.moveTo();
		i.lift();
		i.scan();
		i.recharge();
		i.configure();

	}

}
