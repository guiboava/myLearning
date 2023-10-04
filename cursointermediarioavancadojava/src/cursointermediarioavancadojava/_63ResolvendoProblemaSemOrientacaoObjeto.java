package cursointermediarioavancadojava;

import java.util.Locale;
import java.util.Scanner;

public class _63ResolvendoProblemaSemOrientacaoObjeto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xLado1, xLado2, xLado3, yLado1, yLado2, yLado3, areaX, areaY, p;
		System.out.println("Enter the measures of triangle X: ");
		xLado1 = sc.nextDouble();
		xLado2 = sc.nextDouble();
		xLado3 = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		yLado1 = sc.nextDouble();
		yLado2 = sc.nextDouble();
		yLado3 = sc.nextDouble();
		
		p = (xLado1 + xLado2 + xLado3)/2;
		areaX = Math.sqrt(p*(p - xLado1)*(p - xLado2)*(p - xLado3));
		p = (yLado1 + yLado2 + yLado3)/2;
		areaY = Math.sqrt(p*(p - yLado1)*(p - yLado2)*(p - yLado3));
		
		System.out.println("Triangle X area: " + areaX);
		System.out.println("Triangle Y area: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
