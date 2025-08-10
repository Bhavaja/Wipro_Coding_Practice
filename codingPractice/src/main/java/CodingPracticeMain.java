package main.java;

import java.util.Scanner;

public class CodingPracticeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CodingPractice code = new CodingPractice();
		
		//print reverse tables
		/*System.out.println("------1.Print reverse tables------");
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Reverse table of "+n+" :");
		System.out.println(code.reverseTable(n));
		System.out.println();*/
		
		//print alphabets a-z
		/*System.out.println("------2.Print alphabets from a to z------");
		System.out.println(code.printAlphabets());
		System.out.println();*/
		
		//print ascii values
		/*System.out.println("-----3.Print ascii values-----");
		code.printAscii('a');
		System.out.println();*/
		
		//print factorial
		/*System.out.println("-----4.Find factorial of any number-----");
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Factorial of "+n+" :");
		System.out.println(code.findFactorial(n));
		System.out.println();*/
		
		//count numbers
		/*System.out.println("-----5.Count of positives,negatives and zeroes-----");
		code.countNumbers(3);*/
		
		
		//System.out.println(code.findLargeSmall());
		
		System.out.println(code.findOnesComplement(1010));

	}

}
