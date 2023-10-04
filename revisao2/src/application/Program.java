package application;

import java.util.Locale;
import java.util.Scanner;

import util.calc;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radio = sc.nextDouble();
		System.out.print("Circumference: "+ calc.circumference(radio));
		System.out.println();
		System.out.print("Circumference: "+ calc.volume(radio));
		System.out.println();
		System.out.println("Circumference: "+ calc.PI);
		sc.close();
	}

}
