package cdc1;
interface Book{
	void book(String s);
	
}
interface Details{
	void name();
}
class Cost{
	void price(int d) {
		System.out.println("Price: "+d);
	}
}
class Onlinetransaction extends  Cost implements Book,Details{
	public void book(String s) {
		System.out.println("Book written by "+s);
	}
	public void name() {
		System.out.println("Atomic habits");
	}
	
}

public class Test4 {

	public static void main(String[] args) {
		Onlinetransaction o=new  Onlinetransaction();
		o.name();
		o.book("James");
		o.price(500);
		


	}

}
