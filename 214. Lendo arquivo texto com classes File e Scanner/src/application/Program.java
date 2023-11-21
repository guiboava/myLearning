package application;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = null;

		File file = new File("C:\\temp\\in.txt");
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println(("Error: " + e.getMessage()));
		} finally {
			if(sc != null) {
			sc.close();
			}
		}

	}

}
