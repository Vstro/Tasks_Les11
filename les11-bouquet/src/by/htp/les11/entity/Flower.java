package by.htp.les11.entity;

public class Flower {
	private int petalsAmount;
	
	public Flower() {
		this.petalsAmount = 10;
	}
	
	public Flower(int petalsAmount) {
		this.petalsAmount = petalsAmount;
	}
	
	public int getPetalsAmount() {
		return this.petalsAmount;
	}
	
	public void setPetalsAmount(int petalsAmount) {
		this.petalsAmount = petalsAmount;
	}
	
	public String toString() {
		return "Flower with " + this.petalsAmount + " petals";
	}
}
