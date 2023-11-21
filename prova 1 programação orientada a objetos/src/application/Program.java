package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char escolha = 'n';
		do {
			double lado1 = sc.nextDouble();
			double lado2 = sc.nextDouble();
			double lado3 = sc.nextDouble();
			System.out.println(tipoTriangulo(lado1,lado2,lado3));
			System.out.println("Quer fazer outra conta ? (s/n)");
			escolha = sc.next().charAt(0);
		} while (escolha == 's');

		
		sc.close();
	}
	public static String tipoTriangulo(double lado1, double lado2, double lado3) {
		if (lado1 == lado2 && lado2 == lado3) {
			return "Triângulo Equilátero!";
		} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
			return "Triângulo Isósceles!";
		} else {
			return "Triângulo Escaleno!";
		}
	}

}
