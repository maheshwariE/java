package Day_3;

public class Test1 {

	public static void main(String[] args) {
		String s1="mahi";
		String s2="queen";
		String s3=new String("queen");
		String s4=new String("srujana");
		System.out.println(s1.equals(s2));//.equals() compares the original content of string
		System.out.println(s1==s2);//compares the reference(same memory or not)
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s1.compareTo(s4));

	}

}
