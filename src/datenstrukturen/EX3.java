package datenstrukturen;

import java.util.ArrayList;

public class EX3 {

	public static void main(String[] args) {

		ArrayList<EX3_Item> list = new ArrayList<EX3_Item>();
	
		for (int i = 0; i < 5; i++) {
			EX3_Item item = new EX3_Item("Apfelkloskompott", "Schmeckt nach Äpfeln, Klösen und ein bisschen Kompott", i);
			list.add(item);
		}
		
		for (EX3_Item ex3_Item : list) {
			System.out.println(ex3_Item.getAmount() + "x " + ex3_Item.getTitle());
			System.out.println(ex3_Item.getInformation());
			System.out.println();
		}
	}

}
 