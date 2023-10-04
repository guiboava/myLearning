package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int N = sc.nextInt();
		People[] people = new People[N];
		
		for (int i = 0; i < people.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: " );
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			people[i] = new People(name, age);
		}
		
		int position = 0;
		int elder = 0;
		
		for (int i = 0; i < people.length; i++) {
			if (people[i].getAge() > elder) {
				elder = people[i].getAge();
				position = i;
			}
		}

		System.out.print("PESSOA MAIS VELHA: " + people[position].getName());
		sc.close();
	}

}
