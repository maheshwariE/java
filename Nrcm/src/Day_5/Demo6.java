package Day_5;

public class Demo6 {  //main method can be overloaded in java but not support main method overriding
	    public static void main() {
	    	System.out.println("Good morning");
	    }
	    public static void main(int a,int b) {
	    	System.out.println(a+b);
	    }
	    public static void main(double d1,double d2) {
	    	System.out.println(d1-d2);
	    }
	    public static void main(String s1,String s2) {
	    	System.out.println(s1+s2);
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Demo5 d1=new Demo5();
	        d1.show();
	        d1.show(15, 43);
	        d1.show(8.7,2.5);
	        d1.show("hello", "world");
		}

	}
