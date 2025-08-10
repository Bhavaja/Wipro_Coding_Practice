package exception_package;

import java.util.Scanner;

public class Throw_Throws {
		
	public static void voter_age() throws IllegalArgumentException{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		if (age < 18){
			throw new IllegalArgumentException("You cannot cast the vote. Minimum age is 18.");
		}
		else {
			System.err.println("You can cast the vote");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			voter_age();
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception caught - "+e.getMessage());
		}
		finally {
			System.out.println("Done");
		}		
	}

}
