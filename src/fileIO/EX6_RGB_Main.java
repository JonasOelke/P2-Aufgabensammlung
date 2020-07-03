package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class EX6_RGB_Main {

	public static void main(String[] args) throws IOException {
		
		Random random = new Random();
		byte[] colors = new byte[20];
		
		for (int i = 0; i < colors.length; i++) {
			colors[i] = (byte) random.nextInt(256);
		}
		
		File file = new File("EX6_RGB_1.txt"); 
		FileOutputStream fos = new FileOutputStream(file);
		
		fos.write(colors); 
		fos.flush();
		fos.close();

	}

}
