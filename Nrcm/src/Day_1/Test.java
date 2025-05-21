package Day_1;

public class Test {
	int a=45,b=6;
	static int x=30,y=5;
	void and() {
		System.out.println(a>=b&&a<b);
	}
	void or() {
		System.out.println(x>y||x<=y);
	}
	
	void diff() {
		int p=65,q=5;
		System.out.println(p!=q);
	}

	public static void main(String[] args) {
		Test t1=new Test();
		t1.and();
		//System.out.println((t1.a<t1.b)&&((t1.a==t1.b));
		t1.or();
		//System.out.println((Test.x<Test.y)&&((Test.x==Test.y));
		t1.diff();
		

	}

}
