package application;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados ? ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] nome = new String[n];
		double[] notaPrimeiroSemestre = new double[n];
		double[] notaSegundoSemestre = new double[n];
		
		for (int i=0 ; i< n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n",i+1);
			nome[i] = sc.nextLine();
			notaPrimeiroSemestre[i] = sc.nextDouble();
			sc.nextLine();
			notaSegundoSemestre[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		double media =0;
		for (int i=0; i<n; i++) {
			media = (notaPrimeiroSemestre[i] + notaSegundoSemestre[i]) / 2 ;
			if ( media >= 6.0  ) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}

}
