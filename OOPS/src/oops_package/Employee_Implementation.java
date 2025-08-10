package oops_package;

public class Employee_Implementation {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(11,"A","Development",50000);
		System.out.println(emp1);
		
		Employee emp2 = new Employee(12,"B","Testing",30000);
		System.out.println(emp2);
		
		Employee emp3 = new Employee(13,"C","Dotnet",40000);
		System.out.println(emp3);
		
		Employee emp4 = new Employee(14,"D","Development",50000);
		System.out.println(emp4);
		
		Employee emp5 = new Employee(15,"E","Testing",30000);
		System.out.println(emp5);
		
		Employee emp = new Employee();
		
		emp.setId(16);
		emp.setName("F");
		emp.setDepartment("Dotnet");
		emp.setSalary(40000);
		
		emp.getId();
		emp.getName();
		emp.getDepartment();
		emp.getSalary();
		
		System.out.println(emp);
		
		emp.setId(17);
		emp.setName("G");
		emp.setDepartment("DevOps");
		emp.setSalary(40000);
		
		emp.getId();
		emp.getName();
		emp.getDepartment();
		emp.getSalary();
		
		System.out.println(emp);
		
		emp.setId(18);
		emp.setName("H");
		emp.setDepartment("Dotnet");
		emp.setSalary(40000);
		
		emp.getId();
		emp.getName();
		emp.getDepartment();
		emp.getSalary();
		
		System.out.println(emp);
		
		emp.setId(19);
		emp.setName("I");
		emp.setDepartment("Testing");
		emp.setSalary(30000);
		
		emp.getId();
		emp.getName();
		emp.getDepartment();
		emp.getSalary();
		
		System.out.println(emp);
		
		emp.setId(20);
		emp.setName("J");
		emp.setDepartment("DevOps");
		emp.setSalary(40000);
		
		emp.getId();
		emp.getName();
		emp.getDepartment();
		emp.getSalary();
		
		System.out.println(emp);





	}

}
