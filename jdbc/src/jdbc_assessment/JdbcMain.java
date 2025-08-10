package jdbc_assessment;

import java.util.Scanner;

public class JdbcMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		InsertRecord insert = new InsertRecord();
		DeleteRecord delete = new DeleteRecord();
		UpdateRecord update = new UpdateRecord();
		DisplayRecord display = new DisplayRecord();
		
		System.out.println("------------MENU------------");
		System.out.println("1. Insert a new record");
		System.out.println("2. Delete a record");
		System.out.println("3. Update the record");
		System.out.println("4. Display all the records");
		System.out.println("5. Exit");
		System.out.println();
	
		while(true) {
			System.out.println();
			System.out.println("Enter your choice (1 - 5):");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				insert.insertTable();
				break;
			case 2:
				delete.deleteTable();
				break;
			case 3:
				update.updateTable();
				break;
			case 4:
				System.out.println("StudentDetails records:");
				display.displayTable();
				break;
			case 5:
				System.out.println("Exit");
				System.exit(0);
				break;
			default:
				System.out.println("Choose a valid option.");
				break;
			}
		}
	}
}
