package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.point1 = sc.nextDouble();
		student.point2 = sc.nextDouble();
		student.point3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalPoint());
		if (student.finalPoint() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
