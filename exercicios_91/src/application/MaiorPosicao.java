package application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		double[] vect = new double[n];

		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			sc.nextLine();
		}
		

	    double maior = vect[0];
	    int posmaior = 0;

	    for (int i=1; i<n; i++) {
	        if (vect[i] > maior) {
	            maior = vect[i];
	            posmaior = i;
	        }
	    }
	    
	    System.out.println();
	    System.out.printf("MAIOR VAOR = %.2f\n",vect[posmaior]); 	
	    System.out.printf("POSICAO DO MAIOR VALOR = %d",posmaior );
		
		
		
		sc.close();
	}

}
