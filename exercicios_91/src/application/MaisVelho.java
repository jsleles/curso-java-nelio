package application;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] nome = new String[n];
		int[] idade = new int[n];
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n",i+1);
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
		}

		int idadeMaior = idade[0];
		int posicao    = 0;
		for (int i=1; i<n; i++) {
			if (idade[i] > idadeMaior) {
				idadeMaior = idade[i];
				posicao = i;
			}
		}

		System.out.println();
		System.out.print("Pessoa mais velha: " + nome[posicao]);
		
		
		sc.close();
	}

}
