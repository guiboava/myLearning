package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		int idade = sc.nextInt();
		
		People people = new People(nome, idade);
		
		System.out.println("Dados da pessoa: " + people.toString());
		sc.close();
	}

}
