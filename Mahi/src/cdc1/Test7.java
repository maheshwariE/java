package cdc1;
interface Batting{
	void batting();
	void bowling();
}
class Dhoni implements Batting{
	public void batting() {
		System.out.println("Dhoni is batting!!");
	}
	public void bowling() {
		System.out.println("Aswin is bowling!!");
	}
	public void six() {
		System.out.println("Dhoni hit a six ");
	}
}
interface Bowling{
	void bowlYorker();
	void bowlBouncer();
}
class Bumrah implements Bowling{
	public void bowlYorker() {
		System.out.println("Bumrah delivers a deadly yorker");
	}
	public void bowlBouncer() {
		System.out.println("Bumrah throws a sharp bouncer.");
	}
}
interface Fielding{
	void catchBall();
	void wicket();
}
class Rohit implements Fielding{
	public void catchBall() {
		System.out.println("Virat took a amazing catch");
	}
	public void wicket() {
		System.out.println("Rohit hit the wicket in 5 sec");
	}
}

public class Test7 {

	public static void main(String[] args) {
		Dhoni b=new Dhoni();
		Bumrah b1=new Bumrah();
		Rohit f1=new Rohit();
		b.batting();
		b.bowling();
		b1.bowlYorker();
		b1.bowlBouncer();
		f1.catchBall();
		f1.wicket();


	}

}
