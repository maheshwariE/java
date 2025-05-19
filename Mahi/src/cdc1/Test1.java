package cdc1;


interface Hey{
	 void hi();
	
}
interface Hello{
	void hello();
}
interface Welcome extends Hey,Hello{
	void welcome();
}
public class Test1 implements Welcome{
	public void hi() {
		System.out.println("hi");
	}
	public void hello() {
		System.out.println("hello");
	}
	public void welcome() {
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.hi();
		t1.hello();
		t1.welcome();
	}
}
