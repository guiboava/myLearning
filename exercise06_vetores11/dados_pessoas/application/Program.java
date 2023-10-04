package application;

import java.nio.charset.Charset;
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
			System.out.printf("Altura da %da pessoa: ", i + 1);
			double height = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			char genero = sc.next().charAt(0);
			people[i] = new People(height, genero);
		}

		double highest = people[0].getHeight();
		double lowest = people[0].getHeight();

		for (int i = 0; i < people.length; i++) {
			if (people[i].getHeight() < lowest) {
				lowest = people[i].getHeight();
			}
			if (people[i].getHeight() > highest) {
				highest = people[i].getHeight();
			}
		}
		System.out.printf("Menor altura = %.2f%n", lowest);
		System.out.printf("Maior altura = %.2f%n", highest);

		double femaleHeight = 0;
		int femaleCont = 0;
		int maleCont = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].getGen() == 'F' || people[i].getGen() == 'f') {
				femaleHeight += people[i].getHeight();
				femaleCont++;
			} else {
				maleCont++;
			}
		}

		System.out.printf("Media das alturas das mulheres = %.2f%n", femaleHeight / femaleCont);
		System.out.println("Numero de homens = " + maleCont);
		sc.close();
	}

}
