package fileHandling_pkg;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		File file = new File("MyFile.txt");
		if(file.delete()) {
			System.out.println("File deleted: "+file.getName());
		}
		else {
			System.out.println("Failed to delete the file.");
		}
		
	}

}
