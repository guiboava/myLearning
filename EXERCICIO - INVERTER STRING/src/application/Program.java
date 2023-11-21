package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		
		char[] vetor = string.toCharArray();
		
		String invertido = "";
		
		for (int i = vetor.length - 1; i >= 0; i--) {
			invertido += vetor[i];
		}
		
		System.out.println(invertido);
		
		sc.close();
	}

}
