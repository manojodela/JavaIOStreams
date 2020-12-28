package writing_on_files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_on_file {

	
	public static void main(String[] args) throws IOException {
		
		File directory = new  File("create_directory");
		directory.mkdir();
		
		directory = new File("create_directory\\file.txt");
		directory.createNewFile();
		System.out.println("file created.");
		
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(directory)))
				{
		bufferedWriter.write("manoj");
		bufferedWriter.newLine();
		bufferedWriter.write("odela");
		bufferedWriter.newLine();
		bufferedWriter.write("jagtial");
		bufferedWriter.newLine();
				}
		catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}
