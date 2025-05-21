package Day_5;
class Animal{                   //parent class
	void sleep() {
		System.out.println("Sleeping");
	}
}
class Dog extends Animal{           //child class
	void bark() {
		System.out.println("dog is barking");
	}
}
public class Demo1 {

	public static void main(String[] args) {
	      Dog d1=new Dog();
	      d1.bark();
	      d1.sleep();
	}

}
