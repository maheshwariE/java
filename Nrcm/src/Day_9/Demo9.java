package Day_9;
import java.util.*;
public class Demo9 {

	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<Integer>();//only iterator works for stack
		s1.push(56);//stack doesn't support list
		s1.push(89);
		s1.push(90);
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		//Iterator i1=s1.iterator();
		//while(i1.hasNext()) {
		//	System.out.println(i1.next());
		//}

	}

}
