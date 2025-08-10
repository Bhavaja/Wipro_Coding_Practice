package fileHandling_pkg;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
		try(FileWriter writer = new FileWriter("MyFile.txt")) {
			writer.write("Hello World!");
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
