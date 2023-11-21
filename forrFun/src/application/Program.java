package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		char[] vet = word.toCharArray();
		
		String wordAlt = "";
		
		for (int i = vet.length - 1; i >= 0; i--) {
			wordAlt += vet[i];
		}
		System.out.println(wordAlt);
		sc.close();
	}
}
