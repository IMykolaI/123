package main.java.ua.lviv.iot.fruitShop.managers;

import main.java.ua.lviv.iot.fruitShop.models.CitrusFruits;
import main.java.ua.lviv.iot.fruitShop.models.Color;
import main.java.ua.lviv.iot.fruitShop.models.FruitShop;
import main.java.ua.lviv.iot.fruitShop.models.SummerCitrusFruits;
import main.java.ua.lviv.iot.fruitShop.models.Vitamin;

public class Main {
    static IFruitShopManager<FruitShop> manager;

    // LinkedList<FruitShop> list;
    public static void main(String[] args) {
        manager = new FruitShopManagerImpl();
        manager.addFruit(new CitrusFruits("Blueberry", Color.BLUE, 12.0, true, Vitamin.A, 0.175,
                SummerCitrusFruits.Lemon, true));
        manager.addFruit(
                new CitrusFruits("Cherry", Color.RED, 22.0, false, Vitamin.D, 0.205, SummerCitrusFruits.Lime, false));
        manager.addFruit(
                new CitrusFruits("C2", Color.RED, 2.0, true, Vitamin.B, 0.235, SummerCitrusFruits.Lemon, false));
        manager.addFruit(
                new CitrusFruits("B2", Color.BLUE, 42.0, false, Vitamin.C, 0.225, SummerCitrusFruits.Lime, true));
        manager.addFruit(new CitrusFruits("Orange", Color.ORANGE, 32.0, false, Vitamin.D, 0.105,
                SummerCitrusFruits.Lemon, false));
        manager.addFruit(
                new CitrusFruits("B3", Color.BLUE, 21.0, true, Vitamin.D, 0.125, SummerCitrusFruits.Lime, false));
        manager.addFruit(
                new CitrusFruits("O2", Color.ORANGE, 10.0, true, Vitamin.C, 0.175, SummerCitrusFruits.Lemon, true));
        manager.addFruit(
                new CitrusFruits("C3", Color.RED, 9.0, false, Vitamin.A, 0.135, SummerCitrusFruits.Lime, true));
        manager.addFruit(
                new CitrusFruits("B4", Color.BLUE, 11.0, true, Vitamin.B, 0.145, SummerCitrusFruits.Lemon, true));

        manager.sortByPrice(manager.getFruitShopList(), true);
        manager.printList();
       
        System.out.println("\n\n");
        
        manager.sortByFruitColor(manager.getFruitShopList(), false);
        manager.printList();
    }

}
