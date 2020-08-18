package by.htp.les11.entity;

public class Tulip extends Flower {
	public Tulip() {
		super();
	}
	
	public Tulip(int petalsAmount) {
		super(petalsAmount);
	}
	
	public String toString() {
		return "Tulip with " + this.getPetalsAmount() + " petals";
	}
}
