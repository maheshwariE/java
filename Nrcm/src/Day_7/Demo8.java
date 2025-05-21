package Day_7;

public class Demo8 extends Thread{

	public static void main(String[] args) throws InterruptedException {
		Demo8 d1=new Demo8();
		Thread t1 = new Thread(d1);
		t1.start();
		System.out.println("hi");
		t1.sleep(2000);
		System.out.println("hello");
		/*System.out.println(t1.getName());
		System.out.println(t1.getState());
		Thread t2=new Thread(d1);
		t2.start();
		System.out.println(t2.getName());*/
		
	}

}
