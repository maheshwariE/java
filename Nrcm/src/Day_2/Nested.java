package Day_2;

public class Nested {

	public static void main(String[] args) {
		int a=9;
		if(a%2==0) {
			System.out.println("multiply by 2");
			if(a%3==0) {
				System.out.println("multiply with both 2 and 3");
			}
			else {
				System.out.println("not multiply with 3");
			}
		}
		else {
			if(a<=10) {
				System.out.println("below 10");
			}
			else {
				System.out.println("above 10");
			}
		}

	}

}
