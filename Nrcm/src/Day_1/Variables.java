package Day_1;

public class Variables {
	int a=45,b=6;
	static int x=30,y=5;
	void mod() {
		System.out.println(a%b);
	}
	void mul() {
		System.out.println(x*y);
	}
	
	void div() {
		int p=65,q=5;
		System.out.println(p/q);
	}
   
	public static void main(String[] args) {
		Variables t1=new Variables();
		t1.mod();
		//System.out.println(t1.a%t1.b);
		t1.mul();
		//System.out.println(Test.x*Test.y);
		t1.div();
		
		

	}

}
