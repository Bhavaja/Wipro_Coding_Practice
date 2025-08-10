package SerialVersionUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeUser {

	public static void main(String[] args) throws IOException {
		
		User user = new User("Max","max@gmail.com",25);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));
		out.writeObject(user);
		
		out.close();
	}

}
