package Day_1;

public class Methods {
	int x=7,y=89;
	static int p=45,q=12;
	void div() {
		int a=9,b=10;
		System.out.println(x+y);
		System.out.println(p+q);
		System.out.println(a+b);
	}
	static void show() {
		int a=8,b=9;
		//System.out.println(x+y);(static method doesn't allow instance variables)
		System.out.println(p+q);
		System.out.println(a+b);
		
	}

	public static void main(String[] args) {
		Methods m1=new Methods();
		m1.div();
		show();//for same class
		//Methods.show()-if we use this method in diff class call by using class name
		
				

	}

}
