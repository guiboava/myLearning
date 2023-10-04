package application;

import java.text.Format;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		LocalDate d04 = LocalDate.parse("2023-09-07");
		LocalDateTime d05 = LocalDateTime.parse("2023-09-07T13:15:30");
		Instant d06 = Instant.parse("2023-09-07T13:18:30Z");

		// Instanciando dia, mes, ano[horario] -> Data-hora local
		LocalDate d07 = LocalDate.of(23, 07, 2023);

		// Instanciando Agora -> Data-hora local
		LocalDate d08 = LocalDate.now();

		// Instanciando Padrão ISO -> Data-hora local
		Instant d09 = Instant.parse("2023-09-07T14:00:00Z");

		DateTimeFormatter fmt6 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE;

		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

		System.out.println(d04.format(fmt1));
		System.out.println(fmt1.format(d04));
		System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(d05.format(fmt2));
		System.out.println(fmt3.format(d06));
		System.out.println(fmt5.format(d06));

		sc.close();
	}

}
