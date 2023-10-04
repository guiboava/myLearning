package conteudosCurso;

import java.util.Locale;
import java.util.Scanner;

public class estruturaRepetitivaPara_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for (int i = 4; i >= 0; i--) {
			System.out.println(i);
		}

		sc.close();

	}

}
