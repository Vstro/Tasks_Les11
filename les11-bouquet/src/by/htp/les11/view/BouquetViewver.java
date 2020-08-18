package by.htp.les11.view;

import java.util.List;

import by.htp.les11.entity.Flower;

public class BouquetViewver {
	public void printAll(List<Flower> flowers) {
		System.out.println("------------------------------");
		System.out.println("Bouquet:");
		for (int i = 0; i < flowers.size(); i++) {
			Flower n = flowers.get(i);		
			System.out.println(n.toString());
		}
	}
}
