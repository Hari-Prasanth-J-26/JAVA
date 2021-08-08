package mypack.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyImage {

	public static void main(String[] args) {

		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream ("D:\\Revature"
					+ "\\Revature_Trainee\\Sample_Images_Source\\nature1.jpg"));
			
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Revature"
					+ "\\Revature_Trainee\\Sample_Images_Destination\\nature1_copied.jpg"));
			int byteReader = 0;
			
			while(byteReader != -1) {
				byteReader = bis.read();
				bos.write(byteReader);
			}
			bis.close();
			bos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
