package Day_4;
class Sample2{
	protected void add() {             //void add()-for default we get error in other package
		System.out.println("hello");   //private method only with in the class
	}                                  //public can be accessed anywhere
}
public class Default1 extends Sample2{

	public static void main(String[] args) {
		Default1 d1=new Default1();
		d1.add();

	}

}
