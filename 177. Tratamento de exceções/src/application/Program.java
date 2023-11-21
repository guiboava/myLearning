package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String accountHolder = sc.nextLine();
		System.out.print("Initial balance: ");
		double amount = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		Account account = new Account(accountNumber, accountHolder, amount, withdrawLimit);

		System.out.println();

		System.out.print("Enter amount for withdraw: ");
		amount = sc.nextDouble();
		try {
			account.withDraw(amount);
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		sc.close();
	}

}
