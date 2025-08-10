package employeeMenu_pkg;

public class PersonalDetails {
	
	String name;
	int age;
	String contact;
	String location;
	String marital_status;
	
	public PersonalDetails(String name,int age,String contact,String location,String marital_status) {
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.location = location;
		this.marital_status = marital_status;
	}
	
	public void display() {
		System.out.println("-----Personal details------");
		System.out.println("Name          : "+name);
		System.out.println("Age           : "+age);
		System.out.println("Contact       : "+contact);
		System.out.println("Location      : "+location);
		System.out.println("Marital status: "+marital_status);
	}

}
