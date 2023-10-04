package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Products[] vect = new Products[N];
		double soma = 0;

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
		}
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}
		double avg = soma / N;
		System.out.printf("Average: %.2f%n", avg);
		sc.close();
	}

}
