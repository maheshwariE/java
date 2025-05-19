package cdc1;
interface Switchable{
	void turnOn();
}
class Switchable1 {
	void turnOff() {
		System.out.println("turn off");
	}
}
class Adjustable extends Switchable1 implements Switchable{
	public void turnOn() {
		System.out.println("turn on");
	}
	public void increase() {
		System.out.println("increase speed of fan");
	}

	
}
class Sensor{
	void light() {
		System.out.println("sensor lights are very smart");
	}
}
class Sensor1 extends Sensor{
	void fan() {
		System.out.println("sensor fans are very handy");
	}
}


public class Test8 {

	public static void main(String[] args) {
		Adjustable a=new Adjustable();
		Sensor1 s=new Sensor1();
		a.turnOn();
		a.turnOff();
		a.increase();
		s.light();
		s.fan();


	}

}
