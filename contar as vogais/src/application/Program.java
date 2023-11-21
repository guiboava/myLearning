package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String string = sc.nextLine();
		
		char[] vect = string.toCharArray();
		
		char[] vogais = {'a','e','i','o','u','A','E','I','O','U'};
		
		int totalVogal = 0;
		
		for (int i = 0; i <= vect.length-1 ; i++) {
			for (int j = vogais.length -1; j >= 0; j--) {
				if(vect[i] == vogais[j]) {
					totalVogal += 1;
				}
			}
		}
		System.out.println(totalVogal);
		
		sc.close();
	}

}
