package cursointermediarioavancadojava;

import java.util.Locale;
import java.util.Scanner;

public class sintaxeFuncao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showResult(higher);

		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	/* *PUBLIC - seria o acesso a esse metodo de forma publica, 
	 * *STATIC é o conceito
	de que não nescessariamente precisa ser um objeto(Ainda confuso sobre isto)
	   *VOID - quer dizer que não tera um retorno do metodo para a chamada. */
	public static void showResult(int value) {
		System.out.println("Higer number : " + value);
	}

}
