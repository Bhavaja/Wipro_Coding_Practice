package serialization_pkg;

import java.io.Serializable;

public class SerializableClass implements Serializable{
	
	private String name;
	private int age;
	
	public SerializableClass(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: "+name+", Age: "+age);
	}

	
}
