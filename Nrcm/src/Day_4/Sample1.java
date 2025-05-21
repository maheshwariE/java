package Day_4;

public class Sample1 {
	int x;
	int y;
    public Sample1(int x, int y) {
    	this.x=x;
    	this.y=y;
    	System.out.println(x+y);
    }
    public Sample1(Sample1 s1) {
    	this.x=s1.x;
    	this.y=s1.y;
    	System.out.println(x-y);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 s1=new Sample1(99,78);
		Sample1 s2=new Sample1(s1);
	}

}
