package creating_directory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creating_Directory_on_path_or_project {

	public static void main(String[] args) throws IOException {
		
		File directory = new  File("directory");
		directory.mkdir();
		
		directory = new File("directory\\file.txt");
		directory.createNewFile();
		System.out.println("file created.");
		
	}
}
