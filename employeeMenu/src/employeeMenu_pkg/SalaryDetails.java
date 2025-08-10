package employeeMenu_pkg;

public class SalaryDetails {
	
	String annual_package;
	int monthly_salary;
	
	public SalaryDetails(String annual_package,int monthly_salary) {		
		this.annual_package = annual_package;
		this.monthly_salary = monthly_salary;	
	}
	
	public void display() {
		System.out.println("-----Salary details------");
		System.out.println("Annual package        : "+annual_package);
		System.out.println("Monthly in hand salary: "+monthly_salary);
	}

}
