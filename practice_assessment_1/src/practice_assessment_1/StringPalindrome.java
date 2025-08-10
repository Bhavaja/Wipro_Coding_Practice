package practice_assessment_1;

public class StringPalindrome {
	
	public String check_palindrome(String s) {		
		int i = 0;
		int j = s.length()-1;
		while(i<j) {
			if (s.charAt(i) != s.charAt(j)) {
				return s+" is not a palindrome";
			}
			i++;
			j--;
		}
		return s+" is a palindrome";
	}

	public static void main(String[] args) {
		
		StringPalindrome palindrome = new StringPalindrome();
		System.out.println(palindrome.check_palindrome("malayalam"));
	}

}
