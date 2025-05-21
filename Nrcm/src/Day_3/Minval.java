package Day_3;

public class Minval {

	public static void main(String[] args) {
		int a[]= {4,7,5,8,9};
		//int a1[]=new int[a.length];-for creating new array with existing array
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {       //for max == a[i]>max
				min =a[i];
			}
		}
		System.out.println("min value is :" +min);

	}

}
