package Day_8;

class Test6 extends Thread{
	public void run() {
		System.out.println("good morning");
	}
}
class Test7 implements Runnable{
	public void run() {
		System.out.println("hi");
	}
}

public class Test5 {
	

	public static void main(String[] args) {
		Test6 t1= new Test6();
		Test7 t2=new Test7();
		t1.run();
		Thread  t3= new Thread(t2);
		t3.run();
		

	}

}
