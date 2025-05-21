package Day_9;
import java.util.*;
public class Demo7 {

	public static void main(String[] args) {
		int[] arr= {67,89,90,77,66,55};
		Arrays.sort(arr);
		int a=Arrays.binarySearch(arr, 90);
		System.out.println(a);
		for(int b1:arr)
			System.out.println(b1);
		System.out.println();
		

	}

}
