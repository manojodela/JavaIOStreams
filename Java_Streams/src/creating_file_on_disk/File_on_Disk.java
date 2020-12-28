package creating_file_on_disk;

import java.io.File;
import java.io.IOException;

public class File_on_Disk {

	
	public static void main(String args[]) throws IOException
	{
		
		
		File file = new File("C:\\StudyEasy\\author\\manoj\\new.txt");
		file.createNewFile();
		System.out.println("Directory Created.");
				
		
	}
}
