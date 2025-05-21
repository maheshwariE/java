package Day_5;
class Chocolate{
	void ate() {
		System.out.println("eat dark chocolate");
	}
}
class Dark extends Chocolate{
	void taste1() {
		System.out.println("taste1");
	}
}
class Sweet extends Chocolate{
	void taste2() {
		System.out.println("taste2");
	}
}
class Brownie extends Dark{
	void cost1() {
		System.out.println("500");
	}
}
class Amul extends Dark{
	void cost2() {
		System.out.println("600");
	}
}
class Dairymilk extends Sweet{
	void weight1() {
		System.out.println("250g");
	}
}
class Kitkat extends Sweet{
	void weight2() {
		System.out.println("500g");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		Brownie b1=new Brownie();
		Amul a1=new Amul();
		Dairymilk d1=new Dairymilk();
		Kitkat k1=new Kitkat();
		b1.cost1();
		b1.taste1();
		b1.ate();
		a1.cost2();
		d1.weight1();
		d1.taste2();
		k1.weight2();
	}

}
