package by.htp.les11.entity;

public class Rose extends Flower {
	public Rose() {
		super();
	}
	
	public Rose(int petalsAmount) {
		super(petalsAmount);
	}
	
	public String toString() {
		return "Rose with " + this.getPetalsAmount() + " petals";
	}
}
