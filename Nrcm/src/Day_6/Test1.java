package Day_6;

public class Test1 extends Object{
	int a=90;
    void add() {
    	int a=89;
    	System.out.println(a);
    }
    void sub() {
    	System.out.println(this.a);
    	this.add();
    }
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.sub();

	}

}
