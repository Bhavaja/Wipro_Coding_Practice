package employeeMenu_pkg;

public class ProfessionalDetails {
	
	int employee_id;
	String name;
	int salary;
	String domain;
	String office_location;
	
	public ProfessionalDetails(int employee_id,String name,int salary,String domain,String office_location) {
		this.employee_id = employee_id;
		this.name = name;
		this.salary = salary;
		this.domain = domain;
		this.office_location = office_location;		
	}
	
	public void display() {
		System.out.println("-----Professional details------");
		System.out.println("Employee id    : "+employee_id);
		System.out.println("Name           : "+name);
		System.out.println("Salary         : "+salary);
		System.out.println("Domain         : "+domain);
		System.out.println("Office location: "+office_location);
	}

}
