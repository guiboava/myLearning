package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rented;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
		Rented[] rented = new Rented[10];

		for (int i = 1; i <= N; i++) {
			System.out.printf("Rent #%d:%n",i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			rented[roomNumber] = new Rented(name, email);
			System.out.println();
		}
		for (int i = 0; i < 10; i++) {
			if (rented[i] != null) {
				System.out.printf("%d: %s, %s%n",i,rented[i].getName(),rented[i].getEmail());
			}
		}

		sc.close();
	}

}
