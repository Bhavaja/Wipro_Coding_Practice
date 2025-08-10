package SerialVersionUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeUser {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"));
		User user = (User)in.readObject();
		user.display();
		in.close();

	}

}
