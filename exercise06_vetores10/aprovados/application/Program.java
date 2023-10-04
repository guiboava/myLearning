package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int N = sc.nextInt();
		Students[] student = new Students[N];
		
		for (int i = 0; i < student.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d aluno:%n",i+1);
			sc.nextLine();
			String name = sc.nextLine();
			double firstGrade = sc.nextDouble();
			double secondGrade = sc.nextDouble();
			student[i] = new Students(name, firstGrade, secondGrade);
		}
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < student.length; i++) {
			double media = (student[i].getFirstGrade() + student[i].getSecondGrade()) / 2.0f;
			if (media >= 6) {
				System.out.println(student[i].getName());
			}
		}
		
		sc.close();
	}

}
