package Day_9;
import java.util.*;
public class Demo8 {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(23);
		l1.add(34);
		l1.add(56);
		System.out.println(l1);
		l1.addFirst(12);
		l1.addLast(78);
		l1.add(3,45);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		l1.removeFirstOccurrence(45);
		l1.remove(2);
		System.out.println(l1);

	}

}
