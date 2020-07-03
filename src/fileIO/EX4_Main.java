package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import datenstrukturen.EX1_Buch;

public class EX4_Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		EX4_Buch potter1 = new EX4_Buch("12345", "Harry Propper und die heilige Waschmaschine", "JK Roooooling", 2, 1999);
		EX4_Buch potter2 = new EX4_Buch("54321", "Harry Propper und der Trockner des Grauens", "JK Roooooling", 2, 2002);
		EX4_Buch potter3 = new EX4_Buch("67890", "Harry Propper und die Spülmaschine der Verdamnis", "JK Roooooling", 2, 2003);

		ArrayList<EX4_Buch> liste = new ArrayList<EX4_Buch>();
		
		liste.add(potter1);
		liste.add(potter2);
		liste.add(potter3);
		
		File file = new File("fileio_ex4.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(potter1);
		oos.writeObject(potter2);
		oos.writeObject(potter3);
		oos.writeObject(null);
		oos.flush();
		oos.close();
		
		System.out.println("Objects written to file");
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		EX4_Buch nextBuch = (EX4_Buch) ois.readObject();
		//System.out.println(nextBuch.toString());

		while (nextBuch != null) {
			System.out.println(nextBuch.toString());
			nextBuch = (EX4_Buch) ois.readObject();
		} 
		
	}

}
