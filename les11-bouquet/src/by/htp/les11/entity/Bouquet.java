package by.htp.les11.entity;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
	private List<Flower> flowers;
	
	public Bouquet() {
		flowers = new ArrayList<Flower>();
	}
	
	public Bouquet(Flower... flowers) {
		this.flowers = new ArrayList<Flower>();
		for (int i = 0; i < flowers.length; i++) {
			this.flowers.add(flowers[i]);
		}
	}
	
	public void add(Flower flower) {
		flowers.add(flower);
	}
	
	public List<Flower> getFlowers(){
		return flowers;
	}
}
