package Day_3;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		if (str1.length() !=str2.length()) {
			System.out.println("not anagram");
			return;
		}
		int[] count=new int[26];//for a-z
		
		for(int i=0;i<str1.length();i++) {
			count[str1.charAt(i) - 'a']++;
			count[str2.charAt(i) - 'a']--;
			
		}
		boolean isAnagram = true;
		for (int i=0;i<26;i++) {
			if(count[i] !=0) {
				isAnagram =false;
				break;
			}
		}
		
		if(isAnagram) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
			
	}

}
