package serialization_pkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeObject {

	public static void main(String[] args) {
		
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
			SerializableClass s = (SerializableClass)in.readObject();
			s.display();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
