package Day_3;
abstract class Test3{
	abstract void add();
	abstract void sub();
	static void  mul() {
		System.out.println("multiplication:");
	}
}
class Demo8 extends Test3 {
	public void add() {
		System.out.println("addition");
	}
	public void sub() {
		System.out.println("subtraction");
	}
    void div() {
    	System.out.println("division");
    }
    void mod() {
    	System.out.println("modulus");
    }
	public static void main(String[] args) {
		Demo8 d1=new Demo8();
		d1.add();
		d1.sub();
		Test3.mul();
		d1.div();
		d1.mod();

	}

}
