package by.htp.les11.entity;

public class Carnation extends Flower {
	public Carnation() {
		super();
	}
	
	public Carnation(int petalsAmount) {
		super(petalsAmount);
	}
	
	public String toString() {
		return "Carnation with " + this.getPetalsAmount() + " petals";
	}
}
