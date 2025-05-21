package Day_6;

public class Test5 {
    void show() {
    	System.out.println("hi");
    }
    class Sample5{
    	void print() {
    		System.out.println("hello");
    	}
    }
	public static void main(String[] args) {
		Test5 t1=new Test5();
		t1.show();
		Test5.Sample5 s1= new Test5() .new Sample5();
		s1.print();
	}

}
