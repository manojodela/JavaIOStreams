package Serialization_of_objects;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Write_object {

	
	public static void main(String[] args) throws Throwable {
		
		
		Vehicle bike = new Vehicle("bike", 123);
		Vehicle car = new Vehicle("car",789);
		
		try(FileOutputStream outputStream = new FileOutputStream("Reading_File\\read.dat"))
		{
		try(ObjectOutputStream stream = new ObjectOutputStream(outputStream))
		{
			stream.writeObject(bike);
			stream.writeObject(car);
		}
		}
	}
}
