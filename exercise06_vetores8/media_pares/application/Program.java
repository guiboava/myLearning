package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		int[] vect = new int[N];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		double cont = 0.0f;
		double soma = 0.0f;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2.0f == 0.0f) {
				soma += vect[i];
				cont += 1;
			}
		}
		if (cont > 0) {
			double media = soma / cont;
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();
	}

}
