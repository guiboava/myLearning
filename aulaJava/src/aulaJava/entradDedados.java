package aulaJava;

import java.util.Locale;
import java.util.Scanner;

public class entradDedados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String s1,s2,s3;
		int x;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine(); 
		s3 = sc.nextLine(); 
		
		System.out.printf("%d%n",x);
		System.out.printf("%s%n",s1);
		System.out.printf("%s%n",s2);
		System.out.printf("%s%n",s3);
		sc.close();
	}

}
