import java.util.Scanner;

public class listaExercicioJava_01 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva quantos anos você tem: ");
		int anos = sc.nextInt();
		
		System.out.println("Escreva quantos meses você tem: ");
		int meses = sc.nextInt();

		System.out.println("Escreva quantos dias você tem: ");
		int dias = sc.nextInt();
		
		int total_dias = (anos * 365) + (meses * 30) + dias;
		
		System.out.printf("%d anos, %d meses e %d dias = %d dias.",anos, meses, dias, total_dias);
		
		sc.close();
		
	}

}
