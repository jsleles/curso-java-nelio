package application;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? " );
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		System.out.println();
		for (int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa : " , i+1);
			altura[i] = sc.nextDouble();
			sc.nextLine();
			System.out.printf("Generno da %da pessoa : ", i+1);
			genero[i] = sc.nextLine().charAt(0);
		}
		
		double maiorAltura        = altura[0];
		double menorAltura        = altura[0];
		double somaAlturaMulheres = 0.0;
		int    qtdeMulheres       = 0;
		double mediaMulheres      = 0.0;
		
		int qtdeHomens = 0 ;
		
		for (int i = 0 ; i<n; i++) {
			if (i>0) {
				if (altura[i] > maiorAltura) {
					maiorAltura = altura[i];
				}
				if (altura[i] < menorAltura) {
					menorAltura = altura[i];
				}
			}
			if (genero[i] == 'F') {
				somaAlturaMulheres += altura[i];   
				qtdeMulheres++;
			} 
			else if (genero[i] == 'M') {
				qtdeHomens++;
			}
			
		}
		
		mediaMulheres = somaAlturaMulheres / qtdeMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n",mediaMulheres);
        System.out.printf("Numero de homens = %d\n", qtdeHomens);
		
		sc.close();
	}

}
