package by.htp.les11.main;

import by.htp.les11.entity.Bouquet;
import by.htp.les11.entity.Carnation;
import by.htp.les11.entity.Rose;
import by.htp.les11.entity.Tulip;
import by.htp.les11.view.BouquetViewver;

public class Main {

	public static void main(String[] args) {
		Bouquet bouquet = new Bouquet(new Tulip(7), new Carnation(5));
		BouquetViewver view = new BouquetViewver();
		
		bouquet.add(new Rose(20));
		
		view.printAll(bouquet.getFlowers());
	}

}
