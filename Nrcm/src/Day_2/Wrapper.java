package Day_2;

public class Wrapper {

	public static void main(String[] args) {
		/*implicit
		Integer b=10;
		int a=b;
		System.out.println(a);
		System.out.println(b.getClass());*/
		int a=89;
		Integer b=Integer.valueOf(a);
		System.out.println(b.getClass());
		
	}

}
