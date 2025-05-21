package Day_6;
class Test8{
	static void show() {
		System.out.println("hello");
	}
	static class Sample8{
		static void print() {
			System.out.println("hi");
			show();
		}
		
	}
}
public class Test7 {
    
	public static void main(String[] args) {
		Test8.Sample8.print();

	}

}
