package Day_3;

public class Count {

	public static void main(String[] args) {
		String s1="Helloworld";
		int count=0;
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			if(ch == 'l' ) {
				count++;
				
			}
		}
		System.out.println(count);

	}


	}


