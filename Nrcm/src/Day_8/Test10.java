package Day_8;

public class Test10 extends Thread {
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
    
	public static void main(String[] args) {
		Test10 t1= new Test10();
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		t1.run();

	}

}
