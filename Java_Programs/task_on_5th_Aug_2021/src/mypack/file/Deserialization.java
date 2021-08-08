package mypack.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import mypack.stream.Bus;

public class Deserialization {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Revature"
					+ "\\Revature_Trainee\\Sample_Images_Destination\\buslist.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<Bus> buses = (ArrayList<Bus>) ois.readObject();
			buses.forEach(System.out::println);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
