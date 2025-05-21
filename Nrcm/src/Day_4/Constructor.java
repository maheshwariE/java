package Day_4;

public class Constructor {
	/*public Constructor() {
		System.out.println("good morning");
	}*/
	int a=90;
	public Constructor(int a) {
		this.a=a;//we use"this" for current class property (for same variable or methods name in same class)
		//b=a;
		System.out.println("good morning" + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor c1=new Constructor();//constructor invokes while we create object
		//Constructor c2=new Constructor();
		Constructor c3=new Constructor(45);
		
	}

}
