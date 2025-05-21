package Day_5;
class Movies{
	void genre() {
		System.out.println("crime and thriller");
	}
}
class Hit extends Movies{
	void action() {
		System.out.println("Invistigation");
	}
}
class Hero extends Hit{
	void name() {
		System.out.println("Nani");
	}
}
class Heroien extends Hit{
	void look() {
		System.out.println("Good");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Hero a1=new Hero();
		Heroien b1=new Heroien();
		a1.action();
		a1.genre();
		a1.name();
		b1.look();
		//b1.action();
		//b1.genre();

	}

}
