import java.util.Scanner;
import java.util.Locale;

public class Funcao_matematica {

	public static void main(String[] args) {
		int num1, num2, resultado, conta;
		String tipo;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		tipo="";
				
		System.out.print("Escerva o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.print("1- somar 2- diminuir 3- multiplicar 4- dividir: ");
		conta = sc.nextInt();
		
		System.out.print("Escerva o segundo numero: ");
		num2 = sc.nextInt();
		sc.close();
		switch (conta) {
		case 1: {
			resultado= (int)num1 + num2;
			tipo =  "+";
			System.out.printf("numero escrito: %d %s %d = %d",num1 ,tipo , num2,resultado);
			break;
		}
		case 2: {
			resultado= (int)num1 - num2;
			tipo =  "-";
			System.out.printf(" %d %s %d = %d",num1 ,tipo , num2,resultado);
			break;
		}
		case 3: {
			resultado= (int)num1 * num2;
			tipo =  "*";
			System.out.printf("numero escrito: %d %s %d = %d",num1 ,tipo , num2,resultado);
			break;
		}
		case 4: {
			if (num2==0) {
				System.out.println("Não é possivel fazer a divisão por ZERO.");
				break;
			}
			resultado= (int)num1 / num2;
			tipo =  "/";
			System.out.printf("numero escrito: %d %s %d = %d",num1 ,tipo , num2,resultado);
			break;
		}
		default:
			throw new IllegalArgumentException("VALOR INCORRETO: " + conta);
		}
		
	}

}
