package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EX2_Main {

	public static void main(String[] args) throws IOException {
		File file = new File("fileio_ex2.txt");

		FileReader reader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(reader);

		String lineString = bufferedReader.readLine();

		while (lineString != null) {

			if (lineString.charAt(0) != '#')
				System.out.println(lineString);
			lineString = bufferedReader.readLine();

		}
		
		bufferedReader.close();

	}

}
