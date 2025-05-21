package Day_9;
import java.util.*;
public class Demo4 {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();//Object is parent class of all wrapper class
		l1.add(12);
		l1.add(45);
		l1.add(67);
		List<Object> l2=new ArrayList<Object>();
		l2.add(12);
		l1.add("hi");
		l2.add(67);
		l2.addAll(l1);
		System.out.println(l2);


	}

}
