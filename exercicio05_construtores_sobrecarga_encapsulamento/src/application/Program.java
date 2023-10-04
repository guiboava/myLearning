package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Account name: ");
		String accountName = sc.nextLine();
		
		System.out.print("Do you gonna set a initial balance in account ('yes' or 'no')? ");
		String newBalance = sc.nextLine();
		
		if (newBalance.equals("yes") || newBalance.equals("YES")) {
			System.out.print("Set the initial balance of account: ");
			double accountBalance = sc.nextDouble();
			account = new Account(accountNumber, accountName, accountBalance);
		} else {
			account = new Account(accountNumber, accountName);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account.toString());
		System.out.println();
		
		System.out.print("Enter a deposit value:");
		double depositValue = sc.nextDouble();
		account.accountDeposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.accountWithdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		System.out.println();
		
		
		sc.close();
	}

}
