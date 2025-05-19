package cdc1;
interface Solid{
	void solid();
}
interface Liquid{
	void liquid();
}
class Gas{
	void gas() {
		System.out.println("Oxygen");
	}
}
class Matter extends Gas implements Solid,Liquid{
	public void solid() {
		System.out.println("Sand");
	}
	public void liquid() {
		System.out.println("Water");
	}
}
class Matter1 extends Matter{
	void matter() {
		System.out.println("Matter");
	}
}


public class Test5 {

	public static void main(String[] args) {
		Matter1 m1=new Matter1();
		m1.solid();
		m1.liquid();
		m1.gas();
		m1.matter();

	}

}
