package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03= Instant.now();
		LocalDate d04 = LocalDate.parse("2023-09-07");
		LocalDateTime d05 = LocalDateTime.parse("2023-09-07T13:15:30");
		Instant d06 = Instant.parse("2023-09-07T13:18:30Z");
		Instant d07 = Instant.parse("2023-09-07T13:18:30-03:00");
		LocalDate d08 = LocalDate.parse("07/09/2023",fmt1);
		LocalDateTime d09 = LocalDateTime.parse("07/09/2023 13:28",fmt2);
		LocalDate d10 = LocalDate.of(2023, 9, 20);
		LocalDateTime d11 = LocalDateTime.of(2023, 9, 7, 13, 32);
		
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		
		
		
		sc.close();
	}

}
