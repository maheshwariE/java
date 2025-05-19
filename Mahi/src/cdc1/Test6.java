package cdc1;
interface Indoor{
	void indoreGames(String a);
}
interface Outdoor{
	void outdoorGames(String b);
}
interface Sports{
	void play(String c);
}
class Jhon implements Indoor,Outdoor,Sports{
	public void indoreGames(String a) {
		System.out.println("Indoor Game: "+a);
	}
	public void outdoorGames(String b) {
		System.out.println("OutDoor Game: "+b);
	}
	public void play(String c) {
		System.out.println("Outdoor Games plays in"+c );
		
	}
}
interface Energy{
	void energy(String n);
}
class Mira extends Jhon implements Energy{
	public void energy(String d) {
		System.out.println("Get Energy from: "+d);
	}
	public void diet(String e) {
		System.out.println(e);
	}
}

public class Test6 {

	public static void main(String[] args) {
		Mira p=new Mira();
		p.indoreGames("Chess");
		p.outdoorGames("Cricket");
		p.play("Ground");
		p.energy("Energy Drinks");
		p.diet("Diet food");

	}

}
