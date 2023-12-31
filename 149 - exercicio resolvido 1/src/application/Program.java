package application;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter frt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter frt02 = DateTimeFormatter.ofPattern("MM/yyyy");
		
		// adiciona os dados do trabalhador
		System.out.print("Enter department's name:");
		Department department = new Department(sc.next());
		sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.next());
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(name, level, baseSalary, department);
		
		//PERGUNTA PARA O USUARIO QUANTOS CONTRATOS ESSE TRABALHADOR TERÁ.
		System.out.print("How many contracts to this worker? ");
		Integer manyContracts = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < manyContracts; i++) {
			System.out.printf("Enter contract #%d data:%n", i + 1);
			System.out.print("Date (DD/MM/YYYY): ");
			LocalDate date = LocalDate.parse(sc.next(),frt01);
			sc.nextLine();
			System.out.print("Value per hour: ");
			Double valueHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			Integer duration = sc.nextInt();
			HourContract contract = new HourContract(date, valueHour, duration);
			worker.addContract(contract);
		}
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		YearMonth dateCalculate = YearMonth.parse(sc.next(),frt02);
		System.out.println(worker.toString());
		System.out.printf("Income for %s: %.2f%n", dateCalculate.format(frt02), worker.income(dateCalculate.getYear(),dateCalculate.getMonthValue()));
		
		sc.close();
	}

}
