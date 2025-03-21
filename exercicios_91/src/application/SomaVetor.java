package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[n];
		
		for (int i=0; i< vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i]= sc.nextDouble();
			sc.nextLine();
		}
		
		double soma  = 0;
		double media = 0;
		
		System.out.print("VALORES = ");
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i] + "  ");
			soma += vect[i];
		}
		media = soma / vect.length;	
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);
	
		
		sc.close();
	}

}
