package Day_8;

public class Test4 implements Runnable{
	public void run() {
		System.out.println("hi");
	}


	public static void main(String[] args) {
		Test4 t1=new Test4();
		Test4 t2=new Test4();
		
		
		System.out.println("hello");
		t1.run();
		t2.run();

	}

}
