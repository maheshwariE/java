package Day_3;

abstract class Test2{
	abstract void add();
	abstract void sum();
}
class Demo7 extends Test2{
	public void add() {
		System.out.println("hi");
	}
	public void sum() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Demo7 d1=new Demo7();
		d1.add();
		d1.sum();

	}

}
