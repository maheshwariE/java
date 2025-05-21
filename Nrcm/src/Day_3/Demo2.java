package Day_3;

public class Demo2 {

	public static void main(String[] args) {
		String s1="Helloworld";
		String vowels = "";
		String consonants = "";
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' ||ch =='u') {
				//vowels++;
				vowels+=ch;
			}
			else if (ch >= 'a' && ch <= 'z') {
				//consonants++;
				consonants+=ch;
				
			}
		}
		System.out.println("Vowels: " +vowels + ", Consonants: " + consonants);

	}

}
