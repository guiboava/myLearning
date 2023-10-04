package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrentConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println();
		
		System.out.print("How many dollars will be bought? ");
		double totalDollar = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrentConverter.converter(dollarPrice, totalDollar));
		
		sc.close();
	}

}
