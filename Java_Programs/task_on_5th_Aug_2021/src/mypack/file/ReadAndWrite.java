package mypack.file;

import java.io.*;

public class ReadAndWrite {
	
	public static final int BUFFER = 4096;
	public static final String IMAGE_PATH = "D:\\Revature\\Revature_Trainee\\Sample_Images_Source\\nature.jpg";
	public static final String OUTPUT_IMAGE_PATH = "D:\\Revature\\Revature_Trainee\\Sample_Images_Destination\\nature_copied.jpg";
	public static void main(String[] args) {
	
		try {
			InputStream is = new FileInputStream(IMAGE_PATH);
			OutputStream os = new FileOutputStream(OUTPUT_IMAGE_PATH);
			
			byte[] image = new byte[BUFFER];
			int byteRead = -1;
			while((byteRead = is.read(image)) != -1) {
				os.write(image, 0, byteRead);
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
		
		
}
