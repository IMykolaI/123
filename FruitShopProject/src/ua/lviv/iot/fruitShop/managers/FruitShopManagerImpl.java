 package ua.lviv.iot.fruitShop.managers;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.fruitShop.models.Berries;
import ua.lviv.iot.fruitShop.models.CitrusFruits;
import ua.lviv.iot.fruitShop.models.FruitShop;
import ua.lviv.iot.fruitShop.models.SortBy;
import ua.lviv.iot.fruitShop.models.SummerBerries;
import ua.lviv.iot.fruitShop.models.SummerCitrusFruits;

public class FruitShopManagerImpl implements IFruitShopManager<FruitShop> {
	
	private List <FruitShop> fruitShopList =  new LinkedList<FruitShop>();
	private List <FruitShop> searchedList =  new LinkedList<FruitShop>();
	
	public List<FruitShop> getFruitShopList() {
		return this.fruitShopList;
	}

	CitrusFruits ñitrusFruits;
	Berries berries; 
	
	@Override
	public List<FruitShop> sortByFruitColor(List<FruitShop> list) {	
		fruitShopList.sort(Comparator.comparing(FruitShop::getColor));		
		return fruitShopList;
	}

	@Override
	public List<FruitShop> sortByPrice(List<FruitShop> list, SortBy sortBy) {
		if (sortBy == SortBy.Ascending) {
			fruitShopList.sort(Comparator.comparing(FruitShop::getPrice));
		}if (sortBy == SortBy.Descending) {
			fruitShopList.sort(Comparator.comparing(FruitShop::getPrice).reversed());
		}
		return fruitShopList;
	}

	@Override
	public List<FruitShop> searchBySummerCitrusFruits(List<FruitShop> list, SummerCitrusFruits summerCitrusFruits) {
		for (FruitShop fruit: list) {
			if (fruit.getClass().equals(ñitrusFruits.getClass()) && summerCitrusFruits.equals(ñitrusFruits.getSummerCitrusFruits())) {
				searchedList.add(fruit);
			}
		}
		return searchedList;
	}
	
	@Override
	public List<FruitShop> searchBySummerBerries(List<FruitShop> list, SummerBerries summerBerries) {
		for (FruitShop fruit: list) {
			if (fruit.getClass().equals(berries.getClass()) && summerBerries.equals(berries.getSummerBerries())) {
				searchedList.add(fruit);
			}
		}
		return searchedList;
	}

	@Override
	public void addFruit(FruitShop fruit) {
		fruitShopList.add(fruit);
	}

	@Override
	public void printList() {
		for(int i = 0; i < fruitShopList.size(); i++) {
			System.out.println(fruitShopList.get(i).getName());
		}
			
	}
	

}
