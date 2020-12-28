package Serialization_of_objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	
	public static void main(String[] args) throws Throwable, IOException {
		
		try(FileInputStream outputStream = new FileInputStream("Reading_File\\read.dat"))
		{
		try(ObjectInputStream stream = new ObjectInputStream(outputStream))
		{
			Vehicle v1 = (Vehicle) stream.readObject();
			Vehicle v2 = (Vehicle) stream.readObject();
			System.out.println(v1);
			System.out.println(v2);
		}
	}
}
}
