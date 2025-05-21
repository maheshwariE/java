package Day_8;

public class Test1 extends Thread{
	public void run() {
		System.out.println("hi");
	}
      
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("hello");
		t1.start();
    }

}
