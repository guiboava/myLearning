package util;

public class CurrentConverter {
	
	public static double converter(double dollarPrice, double totalBought) {
		return (dollarPrice * totalBought) + (dollarPrice * totalBought) * 0.06;
	}
}
 