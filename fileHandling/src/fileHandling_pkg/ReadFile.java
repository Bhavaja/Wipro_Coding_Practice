package fileHandling_pkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("MyFile.txt");
		try(BufferedReader reader = new BufferedReader(file)){
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
