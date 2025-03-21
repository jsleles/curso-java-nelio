package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[n];
		for (int i=0; i < vect.length; i++) {
			System.out.print("Digite um numero: " );
			vect[i] = sc.nextDouble();
			sc.nextLine();
		}

		double soma = 0;
		int quantidadeNumerosPares = 0;
        for (int i=0; i<vect.length; i++) {
        	if (vect[i]%2 == 0) {
        		soma += vect[i];
        		quantidadeNumerosPares++;
        	}
        }

        System.out.println();
        if (quantidadeNumerosPares > 0) {
        	double media = soma / quantidadeNumerosPares;
        	System.out.printf("MEDIA DOS PARES = %.1f\n ", media);
        } else {
        	System.out.println("NENHUM NUMERO PAR");
        }
        	
        
		sc.close();
		
	}

}
