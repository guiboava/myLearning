package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {
 
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();
		People[] people = new People[N];
		
		for (int i = 0; i < people.length; i++) {
			System.out.printf("Dados da %da pessoa %n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			people[i] = new People(name, age, height);
		}
		
		double soma = 0;
		
		for (int i = 0; i < people.length; i++) {
			soma += people[i].getHeight();
		}
		
		System.out.printf("Altura média: %.2f%n", soma / N);
		double smaller16 = 0;
		
		for (int i = 0; i < people.length; i++) {
			if (people[i].getAge() < 16) {
				smaller16++;
			}
		}
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", smaller16 / N * 100);
		for (int i = 0; i < people.length; i++) {
			if (people[i].getAge() < 16) {
				System.out.println(people[i].getName());
			}
		}
		sc.close();
	}

}
