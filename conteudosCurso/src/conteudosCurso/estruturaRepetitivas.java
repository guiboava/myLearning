package conteudosCurso;

import java.util.Locale;
import java.util.Scanner;

public class estruturaRepetitivas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x =sc.nextInt();
		int y =0;
		
		while (x != 0) {
			y += x;
			x =sc.nextInt();
		}
		System.out.println(y);
		sc.close();
	}

}
