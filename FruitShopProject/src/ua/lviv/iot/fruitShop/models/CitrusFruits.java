package ua.lviv.iot.fruitShop.models;

public class CitrusFruits extends FruitShop{
	private SummerCitrusFruits summerCitrusFruits;
	private boolean sour;

	public CitrusFruits() {
		super();
	}

	public CitrusFruits(String name, Color color, double price, boolean availability, Vitamin vitamin, double weight) {
		super(name, color, price, availability, vitamin, weight);
	}

	public SummerCitrusFruits getSummerCitrusFruits() {
		return summerCitrusFruits;
	}

	public void setSummerCitrusFruits(SummerCitrusFruits summerCitrusFruits) {
		this.summerCitrusFruits = summerCitrusFruits;
	}

	public boolean isSour() {
		return sour;
	}

	public void setSour(boolean sour) {
		this.sour = sour;
	}

}
