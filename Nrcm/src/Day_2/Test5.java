package Day_2;
//import java.util.*;
public class Test5 {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter a color");
		String color=sc.next();*/
		System.out.println(args[0]);
		String color=args[0];
		switch(color) {
		case "red":
			System.out.println("celebrate holi");   
			break;
		case "green":
			System.out.println("celebrate ramzan");
			break;
		case "while":
			System.out.println("celebrate christmas");
			break;
		default:
			System.out.println("no");
		}

	}

}
