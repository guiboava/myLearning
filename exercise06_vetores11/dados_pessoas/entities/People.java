package entities;

public class People {

	private double height;
	private char gen;
	
	public People(double height, char gen) {
		this.height = height;
		this.gen = gen;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

}
