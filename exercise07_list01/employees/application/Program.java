package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();

		System.out.println();
		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			System.out.printf("Employee %d#:%n", (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id) != null) {
				System.out.print("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
			System.out.println();
		}
		System.out.print("Enter the employee id that will have salary increase : ");
		int idIncrease = sc.nextInt();
		
		if (list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null) != null) {
			System.out.print("Enter the percentage: ");
			double increase = sc.nextDouble();
			for (Employee x : list) {
				if (x.getId() == idIncrease) {
					x.increaseSalary(increase);
				}
			}
		} else {
			System.out.println("This id does not exist!");
		}

		System.out.println();
		System.out.println("List of employees:");

		for (Employee x : list) {
			System.out.println(x.toString());
		
		}
		sc.close();
	}

	public static Integer hasId(List<Employee> list, int id) {
		for (Employee x : list) {
			if (x.getId() == id) {
				return x.getId();
			}
		}
		return null;
	}
}
