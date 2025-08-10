package main.java;

public class StringPracticeMain {

	public static void main(String[] args) {
		
		StringPractice string = new StringPractice();
		
		System.out.println(string.highestFrequency("Malayalam"));
		System.out.println(string.removeSpaces(" Bhav aja "));
		System.out.println(string.concatTwoStrings("Bhavaja", " Chamarthi"));
		System.out.println(string.count("abc@123"));
		System.out.println(string.replaceVowel("hello"));

	}

}
