package Day_5;
interface I3{
	 void add();
	
}
interface I4{
	void sub();
}
interface I5 extends I3,I4{
	void mul();
}
public class Test1 implements I5{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}
	public void mul() {
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.add();
		t1.sub();
		t1.mul();
	}

}
