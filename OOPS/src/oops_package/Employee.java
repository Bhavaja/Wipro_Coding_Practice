package oops_package;

public class Employee {
	
	//private variables
	private int id;
	private String name;
	private String department;
	private int salary;
	
	//default constructor
	public Employee() {
		
	}
	
	//parameterized constructor
	public Employee(int id,String name,String department,int salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int newSalary) {
		salary = newSalary;
	}
	
	//toString() method to display employee details
	public String toString() {
		return "Employee id:" +id+ " , Name:" +name+ " , Department:" +department+ " , Salary:" +salary;
	}
	  

}
