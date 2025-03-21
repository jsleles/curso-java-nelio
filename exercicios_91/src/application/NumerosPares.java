package application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros voce vai digitar ?");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] vect = new int[n];

		for (int i =0; i < vect.length; i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		
		int qtdeNrosPares = 0;
		for (int i=0; i < vect.length; i++) {
			if ( vect[i]%2 == 0 ) {
				System.out.print( vect[i] + "  ");
				qtdeNrosPares++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d", qtdeNrosPares);
		
		
		sc.close();
		
	}

}
