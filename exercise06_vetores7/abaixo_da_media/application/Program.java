package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println();
		
		double totalVect = 0;
		
		for (int i = 0; i < vect.length; i++) {
			totalVect += vect[i];
		}
		double media = totalVect / vect.length;
		System.out.printf("Media do vetor = %.3f%n", media);
		System.out.println("Elementos abaixo da media:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
