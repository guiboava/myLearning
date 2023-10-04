package entities;

public class Student {

	public String name;
	public double point1;
	public double point2;
	public double point3;

	public double finalPoint() {
		return point1 + point2 + point3;
	}

	public double missingPoints() {
		if (finalPoint() < 60.00) {
			return 60.0 - finalPoint();
		} else {
			return 0.0;
		}
	}
}
