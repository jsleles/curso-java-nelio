package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conversor;

public class Exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double cotacaoDolar = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("How many dollars will be bougth? ");
		double totalDolar = sc.nextDouble();
		sc.nextLine();
		
		double amount = Conversor.valorEmReais(cotacaoDolar, totalDolar);
		System.out.printf("Amount to be paid in reais = %.2f\n", amount);
		
		
		sc.close();
		
	}

}
