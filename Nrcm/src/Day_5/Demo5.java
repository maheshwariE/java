package Day_5;//method overloading or complie time polymorphism

public class Demo5 {
    void show() {
    	System.out.println("Good morning");
    }
    void show(int a,int b) {
    	System.out.println(a+b);
    }
    void show(double d1,double d2) {
    	System.out.println(d1-d2);
    }
    void show(String s1,String s2) {
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
