package Day_6;
class Demo1{
	void show() {
		System.out.println("hi");
	}
}
public class Test9 {
    Demo1 d1=new Demo1() {      //anynomous
    	void show() {
    		System.out.println("hello");
    		super.show();
    	}
    };
	public static void main(String[] args) {
		Test9 t1=new Test9();
		t1.d1.show();

	}

}
