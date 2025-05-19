package cdc1;
interface Project{
	void assignment1();
}
class Project1{
	void assignment2() {
		System.out.println("assignment 2 completed");
	}
}
class Project2 extends Project1 implements Project{
	   public void assignment3() {
		   System.out.println("assignment 3 completed");
	   }
	   public void assignment1() {
		   System.out.println("assignment 1 completed");
	   }
}
class Project3 extends Project2{
	public void assignment4() {
		System.out.println("assignment 4 completed");
	}
}
public class Test3 {

	public static void main(String[] args) {
		Project3 p1=new Project3();
		p1.assignment1();
		p1.assignment2();
		p1.assignment3();
		p1.assignment4();
		
	}

}
