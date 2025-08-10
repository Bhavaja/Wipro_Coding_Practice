package SerialVersionUID;
import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUId = 1L;
	
	String name;
	String email;
	int age;
	
	public User(String name,String email,int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name:"+name+" , Email: "+email+" , Age: "+age);
	}

}
