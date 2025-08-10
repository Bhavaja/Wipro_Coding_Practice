package main.java;

public class StringPractice {
	
	//highest frequency character
	public char highestFrequency(String str) {
		int[] freq = new int[256]; // ASCII size
	    char maxChar = ' ';
	    int maxCount = 0;
	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        freq[ch]++;

	        if (freq[ch] > maxCount) {
	            maxCount = freq[ch];
	            maxChar = ch;
	        }
	    }
	    return maxChar;
	}
	 
	//replace vowel with -
	public String replaceVowel(String str) {
		String vowel = "aeiouAEIOU";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(vowel.indexOf(ch) != -1) {
				return str.substring(0, i)+"-"+str.substring(i+1, str.length());
			}
		}
		return str;
	}
	
	//count alphabets,digits and special characters
	public String count(String str) {
		int alphabets = 0;
		int digits = 0;
		int special = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				alphabets += 1;
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				alphabets += 1;
			}
			else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				digits += 1;
			}
			else {
				special += 1;
			}
		}
		return "alphabets-"+alphabets+" digits-"+digits+" special-"+special;
	}
	
	//remove blank spaces
	public String removeSpaces(String str) {	
		str = str.replace(" ", "");	
		return str;
	}
	
	//concat two strings
	public String concatTwoStrings(String str1,String str2) {
		return str1 + str2;
	}

}
