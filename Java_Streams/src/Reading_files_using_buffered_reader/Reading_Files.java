package Reading_files_using_buffered_reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Reading_Files {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Reading_File");
		file.mkdir();
		System.out.println("directory_created");
		
		file = new File("Reading_File\\read.txt");
		file.createNewFile();
		System.out.println("File created");
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
			{
				writer.write("manoj");
				writer.newLine();
				writer.write("odela");
				writer.newLine();
				writer.write("jagtial");
			}
		catch (IOException e) 
		{
			System.out.println("IOexception occured");
	
		}
		try(BufferedReader reader = new BufferedReader(new FileReader("Reading_File\\read.txt")))
		{
			String line;
			while((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}
			
		}
	
	}

}
