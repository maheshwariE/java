package Day_8;

public class Test3 implements Runnable{
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		Test3 t1=new Test3();
		//Test3 t2=new Test3();
		
		Thread  p1= new Thread(t1);
		Thread p2= new Thread(t1);
		
		System.out.println("hello");
		p1.start();
		p2.start();
	}

	

}
