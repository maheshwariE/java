package Day_5;
class Sample1{
	public Sample1() {
		System.out.println("good evening");
	}
	int x=90;
	void print() {
		System.out.println("hello");
	}
}
public class Demo10 extends Sample1{
	public Demo10() {//calling constructor using super keyword
		super();
	}
	void show() {
		
		int y=45;
		super.print();//calling method using super keyword
		System.out.println(super.x);//calling variable using super keyword
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo10 d1=new Demo10();
		d1.show();
	}

}
