package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rented;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String[] rooms = new String[9];

		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
		int[] name = new int[N];
		int

		for (int i = 0; i < rented.length; i++) {
			System.out.printf("Rent #%d:%n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			rented[i] = new Rented(name, email, roomNumber);
			
			System.out.println();
		}
		for (int i = 0; i < rented[i].length; i++) {
				

		}
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.printf(rooms[i]);
			}
		}

		sc.close();
	}

}
