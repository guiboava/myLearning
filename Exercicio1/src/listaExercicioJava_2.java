import java.util.Scanner;

public class listaExercicioJava_2 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um numero: ");
		double mediaUm, mediaDois,somaMedia, mediaMedias;
		mediaUm = (8.0+9.0+7.0)/3.0;
		mediaDois = (4.0+5.0+6.0)/3.0;
		somaMedia = mediaUm + mediaDois;
		mediaMedias = (mediaUm + mediaDois)/2.0;
		
		System.out.printf("Media um: %.2f, media dois: %.2f, soma das medias: %.2f, media das soma das medias: %.2f",mediaUm,
							mediaDois,somaMedia,mediaMedias);
		sc.close();
		
	}

}
