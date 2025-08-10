package list_pkg;

public class Customer {

	private String id;
	private String name;
	private String contact;
	private String location;
	
	public Customer(String id,String name,String contact,String location) {
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.location = location;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getContact() {
		return contact;
	}
	public String getLocation() {
		return location;
	}
	
	public String toString() {
		return "Id: "+id+" , Name: "+name+" , Contact: "+contact+" , Location: "+location;
	}

}
