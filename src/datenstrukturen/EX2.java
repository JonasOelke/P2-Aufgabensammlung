package datenstrukturen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX2 {

	public static void main(String[] args) {

		HashSet<String> words = new HashSet<String>();
		int wordCount = 0;

		File file = new File("test.txt");

		try {
			FileReader reader = new FileReader(file);
			String fileString = "";

			BufferedReader br = new BufferedReader(reader);
			String line = br.readLine();

			while (line != null) {
				fileString += line + " ";
				line = br.readLine();
			}

			Pattern pattern = Pattern.compile("\\S*\\s");
			Matcher matcher = pattern.matcher(fileString);

			while (matcher.find()) {
				String match = matcher.group();
				System.out.println(match);

				words.add(match);
				wordCount++;
			}

			System.out.println("HashMap size is " + words.size());
			System.out.println("wordCount ist " + wordCount);
			
			for (String string : words) {
				System.out.println(string);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		/*
		 * If the same word exists more than once in the file, it counts multiple times as a word,
		 * but the same element can only exist once in a Set, so it is not added to the set again. 
		 */
	}

}
