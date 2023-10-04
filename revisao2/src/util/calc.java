package util;

public class calc {
	public static double PI = 3.14;
	
	public static double circumference(double raio) {
		return 2.0 * PI * raio;
	}
	public static double volume(double raio) {
		return 4.0 *PI * Math.pow(raio, 3.0) / 3.0;
	}
	
}
