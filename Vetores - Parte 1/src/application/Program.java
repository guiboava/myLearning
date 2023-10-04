package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vect= new double[N];
		double soma = 0;

		for (int i = 0; i < N; i++) {
			vect[i] = sc.nextDouble();
		}
		for (int i = 0; i < N; i++) {
			soma += vect[i];
		}
		System.out.printf("average: %.2f%n", soma / N);
		sc.close();
	}

}
