import java.util.Scanner;

public class exercicioresolvido1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva a largura do terreno: ");
		double largTerreno = sc.nextDouble();
		
		System.out.println("Escreva a Comprimento do terreno: ");
		double CompTerreno = sc.nextDouble();
		
		System.out.println("Escreva o valor do metro²: ");
		double valorMetro = sc.nextDouble();
		
		System.out.println("AREA = " + (largTerreno * CompTerreno));
		System.out.println("PRECO = " + (valorMetro*(largTerreno * CompTerreno)));
		
		sc.close();
	}

}
