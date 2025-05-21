package Day_6;

public class Test2 {
    void show() {
    	final int a=23;
    	System.out.println(a);
    	//a=34;// it shows error because final varible can not be reassign
    	//System.out.println(a);
    }
	public static void main(String[] args) {
		Test2 t1=new Test2();
		t1.show();
	}

}
