package Day_7;

import java.util.*;

public class Demo5 {
	static void add(int a ,int b) throws ArithmeticException,InputMismatchException{
		//Scanner sc = new Scanner(System.in);
				//System.out.println("enter a,b values");
				 //int a=sc.nextInt();
				 //int b=sc.nextInt();
		if(b==0) {
			throw new ArithmeticException("maths radha niku?");
		}
		 int c=a/b;
		 System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo5 d1=new Demo5();
		try {
			add(10,0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Covered all keywords");
		}
		
        
	}

}
