package datenstrukturen;

import java.util.ArrayList;

public class EX7_Main {

	public static void main(String[] args) {


		ArrayList<EX7_IBuyable> buyables = new ArrayList<EX7_IBuyable>();
		
		buyables.add(new EX7_Car(9865.05f));
		buyables.add(new EX7_Car(423.6f));
		buyables.add(new EX7_Drink(2.95f));
		buyables.add(new EX7_Drink(6.23f));
		
		for (EX7_IBuyable buyable : buyables) {
			System.out.println(buyable.toString());
		}
		
	}

}
