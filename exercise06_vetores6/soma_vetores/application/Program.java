package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores teram em cada vetor ?");
		int N = sc.nextInt();
		int[] vectA = new int[N];
		int[] vectB = new int[N];
		int[] vectC = new int[N];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		for (int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
		}
		System.out.println("Vetor resultante: ");
		for (int i = 0; i < vectC.length; i++) {
			System.out.println(vectC[i]);
		}

		sc.close();
	}

}
