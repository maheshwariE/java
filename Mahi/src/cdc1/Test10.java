package cdc1;
interface Purchasable{
	void purchase();
}
interface Shippable{
	void ship();
}
interface Returnable{
	void returnItem();
	
}
interface Discountable extends Purchasable,Shippable,Returnable{
	void applyDiscount();
	void noDiscount();
}
class Product implements Discountable{
	public void purchase() {
		System.out.println("item is available for purchase");
	}
	public void ship() {
		System.out.println("item is available for shipping");
	}
	public void returnItem() {
		System.out.println("item is is available for returning");
	}
	public void applyDiscount() {
		System.out.println("Discount is applicable");
	}
	public void noDiscount() {
		System.out.println("Discount is not applicable");
	}
	
}

public class Test10 {

	public static void main(String[] args) {
		Product s=new Product();
		s.purchase();
		s.ship();
		s.returnItem();
		s.applyDiscount();
		s.noDiscount();


	}

}
