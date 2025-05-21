package Day_4;

public class Test1 {
    int x;
    int y;
    int z;
    public Test1() {
    	System.out.println("Welcome to my profile:Mahi");
    }
    public Test1(int x) {
    	this.x=x;
    	System.out.println("ssc marks: "+x);
    }
    public Test1(int x,int y) {
    	this.x=x;
    	this.y=y;
    	System.out.println("ssc marks: "+ x +" ,inter marks: "+ y);
    }
    public Test1(int x,int y,int z) {
    	this.x=x;
    	this.y=y;
    	this.z=z;
    	System.out.println("ssc marks: "+ x +" ,inter marks: "+ y + " ,btech marks: "+ z);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		Test1 t2=new Test1(100);
		Test1 t3=new Test1(100,883);
		Test1 t4=new Test1(100,883,790);
		
	}

}
