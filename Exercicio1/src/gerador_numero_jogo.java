import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class gerador_numero_jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Digite quantos jogos você fará: ");
		int quantosJogos = sc.nextInt();
		int numRandom,num1= 0,num2= 0,num3= 0,num4= 0,num5= 0,num6= 0;
		int contadorJogos = 0;
		
		
		while( contadorJogos<quantosJogos) {
		contadorJogos = contadorJogos +1;
		int contadorNum = 0;
		
		while(contadorNum<6) {
			contadorNum = contadorNum+1;
			numRandom = rand.nextInt(1,80);
		
		switch (contadorNum) {
		
		case 1: {
			num1 = numRandom ;
			break;
		}
		case 2: {
			if (numRandom == num1) {
				contadorNum=contadorNum -1 ;
				break;
			}else {
				num2 = numRandom ;
				break;
			}
			
		}
		case 3: {
			if ((numRandom == num1)||(numRandom == num2)) {
				contadorNum=contadorNum -1 ;
				break;
			}else {
				num3 = numRandom ;
				break;
			}
			
		}
		case 4: {
			if ((numRandom == num1)||(numRandom == num2)||(numRandom == num3)) {
				contadorNum=contadorNum -1 ;
				break;
			}else {
				num4 = numRandom ;
				break;
			}
			
		}
		case 5: {
			if ((numRandom == num1)||(numRandom == num2)||(numRandom == num3)||(numRandom == num4)) {
				contadorNum=contadorNum -1 ;
				break;
			}else {
				num5 = numRandom ;
				break;
			}
			
		}
		case 6: {
			if ((numRandom == num1)||(numRandom == num2)||(numRandom == num3)||(numRandom == num4)||(numRandom == num5)) {
				contadorNum=contadorNum -1 ;
				break;
			}else {
				num6 = numRandom ;
				
				System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);
				break;
			}
			
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + contadorJogos);
		}
		}
		
	}
		sc.close();
}
}