package Reading_files_using_scanner_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Reading_Files {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner  sc = new Scanner(new  File("reading_File\\read.txt"));
		String line;
		
		while(sc.hasNext() )
		{
			line = sc.next();
			System.out.println(line);
		}
		
		
	}

}
