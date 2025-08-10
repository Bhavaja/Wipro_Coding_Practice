package exception_package;
import java.util.Scanner;
 
public class StudentClass {
	
	public static void main(String[] args) throws InvalidGradeException{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		int[] students = new int[n];
		
		for(int student:students) {
			System.out.print("Student's name: ");
			String name = sc.next();
			System.out.print("Grade: ");
			int grade = sc.nextInt();
			
			try{
				if(grade<0 || grade>100) {
					throw new InvalidGradeException("Grade must be in range 0 to 100");
				}
			}
			catch(InvalidGradeException e) {
				System.out.println("Exception caught - "+e.getMessage());
			}
			finally {
				System.out.println("Done");
			}
		}
			
	}
}

