package util;

public class CurrecyConverter {

	public static Double dollarConverter(double priceDollar, double boughtDollar) {
		return priceDollar * (boughtDollar * 1.06);
	}
}
