package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhysicalPerson;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char payerChose = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			if (payerChose == 'i') {
				System.out.print("Health expenditures: ");
				double expenditures = sc.nextDouble();
				list.add(new PhysicalPerson(name, income, expenditures));
			} else if (payerChose == 'c') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new LegalPerson(name, income, employees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		double taxSum = 0;
		for (TaxPayer taxPayer: list) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f",taxPayer.totalTax()));
			taxSum += taxPayer.totalTax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", taxSum));
		sc.close();
	}
  
}
