package Day_9;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(45);
		l1.add(67);
		List<Integer> l2=new ArrayList<Integer>(l1);//copying the l1 elements to l2
		l2.add(12);
		l1.add(45);
		l2.add(67);
		System.out.println(l2);
		Iterator i1=l2.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}

}
