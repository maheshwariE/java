package Day_5;
class Test35{
	void add() {
		System.out.println("hi");
	}
}

public class Demo7 extends Test35{
     void add() {
    	 System.out.println("hello");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo7 d1=new Demo7();
        d1.add();
	}

}
