package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		double[] vect = new double[N];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		double higherNumber = 0;
		int numberPosition = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > higherNumber) {
				higherNumber = vect[i];
				numberPosition = i;
			}
		}
		
		System.out.println();
		System.out.println("Maior valor = " + higherNumber);
		System.out.println("Posicao do maior valor = " + numberPosition);

		sc.close();
	}

}
