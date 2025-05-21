package Day_6;
 class Sample1{
	 void show() {
		System.out.println("hi");
	}
}
public class Test3 extends Sample1{  //we can't access the final class anywhere
	void show() {    // it shows error because final method  can not be override
    	int a=23;
    	System.out.println(a);
    	a=34;
    	System.out.println(a);
    }

	public static void main(String[] args) {
		Test3 t1=new Test3();
		t1.show();

	}

}
