package applicantion;

import java.util.Locale;
import java.util.Scanner;

import util.CurrecyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println();
		System.out.println("How many dollars will be bought? ");
		double dollarBought = sc.nextDouble();
		System.out.println();
		
		System.out.println("Amount to be paid in reais = " + CurrecyConverter.dollarConverter(dollarPrice,dollarBought));
		
		sc.close();
	}

}
