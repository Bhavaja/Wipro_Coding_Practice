package practice_assessment_1;

import java.util.Scanner;

public class Factorial {
	
	public int find_factorial(int num) {
		
		int fact = 1;
		int i = 1;
		while(i<=num) {
			fact = fact*i;
			i++;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Factorial factorial = new Factorial();
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Factorial is "+factorial.find_factorial(num));
	}

}
