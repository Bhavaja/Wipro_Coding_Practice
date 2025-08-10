package practice_assessment_1;

import java.util.Scanner;

public class PrimeNumber {
	
	public int check_prime(int num) {
		if(num==2) {
			return 1;
		}
		else {
			int i = 2;
			while(i<num) {
				if(num%i==0) {
					return 0;
				}
				i++;
			}
			return 1;
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeNumber prime = new PrimeNumber();
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if(prime.check_prime(num)==0) {
			System.out.println(num+" is not prime");
		}
		else {
			System.out.println(num+" is prime");
		}

	}

}
