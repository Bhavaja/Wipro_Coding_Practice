package employeeMenu_pkg;

import java.util.Scanner;

public class EmployeeMenu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PersonalDetails personal = new PersonalDetails("Kevin",25,"9876543210","Chennai","Unmarried");
		ProfessionalDetails pofessional = new ProfessionalDetails(102,"Kevin",35000,"Testing","Chennai");
		SalaryDetails salary = new SalaryDetails("4 LPA",35000);
		LeavesDetails leaves = new LeavesDetails(10,5,10,4);
		ProjectsUndertaken project = new ProjectsUndertaken("Deepfake detection system","Sales prediction system");
		
		System.out.println("         Employye Details");
		System.out.println("            ---------");
		System.out.println("1. Display Employee Personal Details.");
		System.out.println("2. Display Employee Professional Details.");
		System.out.println("3. Display Employee Salary Details.");
		System.out.println("4. Display Employee Earned Leaves and Casual Leaves.");
		System.out.println("5. Display Emloyee Projects Undertaken.");
		System.out.println("6. Exit the Menu.");
		
		while(true) {
			System.out.println();
			System.out.print("Choose an option from the menu:");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				personal.display();	
				break;
			case 2:
				pofessional.display();
				break;
			case 3:
				salary.display();
				break;
			case 4:
				leaves.display();
				break;
			case 5:
				project.display();
				break;
			case 6:
				System.out.println("Exit the menu");
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		}

	}

}
