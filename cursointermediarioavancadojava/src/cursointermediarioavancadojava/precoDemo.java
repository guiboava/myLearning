package cursointermediarioavancadojava;

import java.util.Locale;
import java.util.Scanner;

public class precoDemo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b00100000;
		int N = sc.nextInt();
		
		if ((N & mask) !=0 ) {
			System.out.println("6 bit é real");
		} else {
			System.out.println("6 bit é falso");
		}
		
		sc.close();  
	}

}
