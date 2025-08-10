package serialization_pkg;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeObject {

	public static void main(String[] args) {
		
		SerializableClass s1 = new SerializableClass("Laya",13);
		try{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
			out.writeObject(s1);
			System.out.println("Object serialized to student.ser");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
