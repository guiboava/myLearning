package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.printf("Employee #%d data:%n", i);
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valueHours = sc.nextDouble();
			if (outsourced == 'y' || outsourced == 'Y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valueHours, additionalCharge));
			} else if (outsourced == 'n' || outsourced == 'N') {
				list.add(new Employee(name, hours, valueHours));
			} else {
				System.out.println("Caracter fail, try again!");
				i -= 1;
			}
		}
		System.out.println("PAYMENTS:");
		for (Employee e :list) {
			System.out.printf("%s - $ %.2f%n",e.getName(),e.payment());
		}
		sc.close();
	}

}
