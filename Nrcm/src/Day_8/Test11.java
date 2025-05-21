package Day_8;

public class Test11 implements Runnable{
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		Thread t1=new Thread(new Test11());
		t1.start();

	}

}
