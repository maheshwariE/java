package Day_8;
import java.util.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.ListIterator;

public class Test17 {

	public static void main(String[] args) {
		Vector<Integer> l1=new Vector<Integer>();
		l1.add(42);
		l1.add(12);
		l1.add(78);
		System.out.println(l1);
		Enumeration i1=l1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());
		}
		

	}

}
