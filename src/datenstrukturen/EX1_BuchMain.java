package datenstrukturen;

import java.util.HashMap;

public class EX1_BuchMain {

	public static void main(String[] args) {
		EX1_Buch potter1 = new EX1_Buch("12345", "Harry Propper und die heilige Waschmaschine", "JK Roooooling", 2, 1999);
		EX1_Buch potter2 = new EX1_Buch("54321", "Harry Propper und der Trockner des Grauens", "JK Roooooling", 2, 2002);
		EX1_Buch potter3 = new EX1_Buch("67890", "Harry Propper und die Spülmaschine der Verdamnis", "JK Roooooling", 2, 2003);
		
		HashMap<EX1_Buch, Integer> library = new HashMap<EX1_Buch,Integer>();
		
		library.put(potter1, 3);
		library.put(potter2, 4);
		library.put(potter3, 5);
		
		for (EX1_Buch book : library.keySet()) {
			System.out.println("We have " + library.get(book) + " exemplares of the book " + book.getTitle());
		}

	}

}
