package fileIO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EX5_Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Type a filename:");
		Scanner inputScanner = new Scanner(System.in);
		File file = new File(inputScanner.nextLine());
		
		if (file.createNewFile()) System.out.println("The file has been successfully created!");
		else System.out.println("This file exists already!");

	}

}
