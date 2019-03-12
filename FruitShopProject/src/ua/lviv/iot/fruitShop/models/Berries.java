package ua.lviv.iot.fruitShop.models;

public class Berries extends FruitShop{
	private SummerBerries summerBerries;
	private boolean sweet;
	
	public Berries() {
		super();
		
	}
	public Berries(String name, Color color, double price, boolean availability, Vitamin vitamin, double weight) {
		super(name, color, price, availability, vitamin, weight);
		
	}
	
	public SummerBerries getSummerBerries() {
		return summerBerries;
	}
	public void setSummerBerries(SummerBerries summerBerries) {
		this.summerBerries = summerBerries;
	}
	public boolean isSweet() {
		return sweet;
	}
	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}
	
}
