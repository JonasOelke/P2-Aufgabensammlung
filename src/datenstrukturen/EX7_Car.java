package datenstrukturen;

public class EX7_Car implements EX7_IBuyable {

	private float price;

	public EX7_Car(Float priceFloat) {
		this.price = priceFloat;
	}

	@Override
	public float price() {
		return price;
	}

	@Override
	public String toString() {
		return "Auto für nur " + price;
	}

}
