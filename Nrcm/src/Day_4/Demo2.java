package Day_4;
class Test14{
	 void add() {
		System.out.println("hi");
	}
}
public class Demo2 extends Test14{

	public static void main(String[] args) {
		Demo2 d1=new Demo2();
		d1.add();//we are getting error because the method is private in another class
	}

}
