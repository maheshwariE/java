package Day_8;

class Test extends Thread{
	public void run() {
		System.out.println("hi");
	}
}
class Test09 extends Test{
	public void run() {
		System.out.println("hello");
	}
}
class Test00 implements Runnable{
	public void run() {
		System.out.println("good morning");
	}
}
class Test011 extends Test00{
    public void run() {
		System.out.println("welcome");
	}
}

public class Test8 {

	public static void main(String[] args) {
		Test t6=new Test();
		Test09 t1= new Test09();
		Test00 t2= new Test00();
		Test011 t3=new Test011();
		t6.run();
		t1.run();
		Thread  t4= new Thread(t2);
		Thread  t5= new Thread(t3);
		t4.run();
		t5.run();

	}

}
