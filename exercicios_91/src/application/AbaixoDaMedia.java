package application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor ? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[n];
		for (int i=0; i< vect.length; i++) {
			System.out.print("Digite um numero: " );
			vect[i] = sc.nextDouble();
			sc.nextLine();
		}
		
        double total = 0;
        double media = 0;
        for (int i=0; i<vect.length; i++) {
        	total += vect[i];
        }
		
        media = total / vect.length;
        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA");
        for (int i= 0; i<vect.length; i++) {
        	if (vect[i] < media) {
        		System.out.println(vect[i]);
        	}
        }
        
		
		sc.close();
	}

}
