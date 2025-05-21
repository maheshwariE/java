package Day_5;//interface support multiple inheritance
interface I1{
	 void add();
	
}
interface I2{
	void sub();
}
public class Demo9 implements I1,I2{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Demo9 d1=new Demo9();
		d1.add();
		d1.sub();
	}

}
