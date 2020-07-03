package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EX1_Main {
	
	public static void main(String[] args) {
		
		Boolean quit = false;
		File file = new File("test.txt");
		Scanner input = new Scanner(System.in);
		System.out.println("Type whatever you would like to save in the file (type 'quit' to exit):");
		FileWriter fw;
		try {
			fw = new FileWriter(file, true);
			
			while (!quit) {
				String next = input.next();
				
				if (next.equals("quit")) quit = true;
				else fw.write(next);
			}
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
			fr.close();
		} catch(Exception IOException) {
			IOException.printStackTrace();
		}
		
		
	}
}
