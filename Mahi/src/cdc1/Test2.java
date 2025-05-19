package cdc1;
interface Enrollable{
	void enroll();
}
interface Teachable  extends Enrollable {
	void teach();
}
class Certifiable  implements Teachable{
	public void enroll() {
		System.out.println("Enrolled");
	}
	public void teach() {
		System.out.println("Start Teaching");
	}
	public void getCertificate() {
		System.out.println("Get certificate");
	}
}
class Grade implements Teachable{
	public void enroll() {
		System.out.println("Enrolled");
	}
	public void teach() {
		System.out.println("Start Teaching");
	}
	public void getGrade() {
		System.out.println("Get Grades");
	}
}
public class Test2{

	public static void main(String[] args) {
    Certifiable c=new Certifiable();
    Grade a=new Grade();
	c.enroll();
	c.teach();
	c.getCertificate();
	a.getGrade();

	}

}
