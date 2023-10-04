package aulaJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva a largura: ");
		double largura_Casa = sc.nextDouble();

		System.out.println("Escreva a comprimento: ");
		double comprimento_Casa = sc.nextDouble();

		System.out.println("Escreva a preco do m²: ");
		double preco_Metro = sc.nextDouble();

		double area = largura_Casa * comprimento_Casa;
		double preco = area * preco_Metro;

		System.out.println();
		System.out.printf("Area: %.2f%n", area);
		System.out.printf("Area: %.2f%n", preco);
		
		sc.close();
	}

}
