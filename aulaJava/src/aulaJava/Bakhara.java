package aulaJava;

import java.util.Scanner;

public class Bakhara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, delta, x1, x2;

		System.out.println("Escreva o valor de 'a': ");
		a = sc.nextDouble();
		System.out.println("Escreva o valor de 'b': ");
		b = sc.nextDouble();
		System.out.println("Escreva o valor de 'c': ");
		c = sc.nextDouble();

		// Fazer o calculo do Delta.

		delta = Math.pow(b, 2.0) - 4 * a * c;

		// fazer o calculo de Baskhara.

		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		System.out.printf("S={%.2f.%.2f}", x1, x2);
		sc.close();
	}

}
