package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EX3_Main {

	public static void main(String[] args) throws IOException {
		Scanner inputScanner = new Scanner(System.in);
		
		File file = new File("fileio_ex3.txt");
		FileWriter writer = new FileWriter(file, true);
		PrintWriter printWriter = new PrintWriter(writer);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Wähle einen Nutzernamen");
			String usernameString = inputScanner.nextLine();
			printWriter.println(usernameString);
			printWriter.flush();
		}
		printWriter.close();
		writer.close();
		
		FileReader reader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String string = bufferedReader.readLine();
		while (string != null) {
			System.out.println(string);
			string = bufferedReader.readLine();
		}
		
		bufferedReader.close();
		reader.close();

	}

}
