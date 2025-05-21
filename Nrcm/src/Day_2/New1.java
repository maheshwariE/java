package Day_2;

public class New1 {

	public static void main(String[] args) {
		int a=9;
		if(a%2==0) {
			System.out.println("divisible by 2");
		}
		else {
			if(a%3==0) {
				System.out.println("divisible by 3");
			}
			else {
				System.out.println("not divisible by both 2 n 3");
			}
		}
	}

}
