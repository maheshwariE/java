package Day_4;


public class Sample {
	int a;
	int b;
	public Sample(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1= new Sample(78,34);
		s1.add();
		
	}

}
