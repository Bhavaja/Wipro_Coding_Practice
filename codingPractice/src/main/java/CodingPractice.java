package main.java;

import java.util.Scanner;

public class CodingPractice {
	
	Scanner sc = new Scanner(System.in);
	
	//1. Method to print reverse tables
	public String reverseTable(int n) {
		String result = "";
		for(int i=10; i>0; i--) {
			result+=((n*i)+" ");
		}	
		return result.trim();
	}
	
	//2. Method to print alphabets from a to z
	public String printAlphabets() {
		String result = "";
		for(int i=97; i<=122; i++) {
			result += (char)i + " ";
		}
		return result.trim();
	}
	
	//3. Method to print ascii values
	public String printAscii(char ch) {
		return("Ascii value of "+ch+" is "+(int)ch);
	}
	
	//4. Method to find factorial of any number
	public int findFactorial(int n) {
		int fact = 1;
		int i = 1;
		while(i<=n) {
			fact = fact * i;
			i++;
		}
		return fact;
	}
	
	//5.Method to count positives,negatives and zeroes
	public String countNumbers(int n) {
		int i = 1;
		int positive_count = 0;
		int negative_count = 0;
		int zero_count = 0;
		while(i<=n) {
			System.out.println("Enter the number:");
			int num = sc.nextInt();
			if(num>0) {
				positive_count+=1;
			}
			else if(num<0) {
				negative_count+=1;
			}
			else {
				zero_count+=1;
			}
			i++;
		}
		return("positives: "+positive_count+" negatives: "+negative_count+" zeroes: "+zero_count);	
	}
	
	//6.largest and smallest numbers
	public String findLargeSmall() {
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		int max = nums[0];
		int min = nums[0];
		for(int i=0; i<n; i++) {
			if(nums[i]<min) {
				min = nums[i];
			}
			else if(nums[i]>max) {
				max = nums[i];
			}
		}
		return("Smallest number:"+min+" Largest number:"+max);
	}
	
	//8.1's complement
	public int findOnesComplement(int n) {
		return ~n;
	}
}
