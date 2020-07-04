package datenstrukturen;

public class EX7_Drink implements EX7_IBuyable{
	
	private float price;
	
	public EX7_Drink(Float priceFloat) {
		this.price = priceFloat;
	}

	@Override
	public float price() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Drink zum Preis von" + price;
	}

}
