package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] pessoa = new Pessoa[n];
		
		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("Dados da %da pessoa :\n",i+1);
            System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			//sc.nextLine();
			System.out.print("Altura : ");
			double altura = sc.nextDouble();
			sc.nextLine();
			pessoa[i] = new Pessoa (nome, idade, altura);
		}
		

		double media = 0.0;
		double soma = 0.0;
		double percentualMenoresDezesseis = 0.0;
		int menoresDezesseis = 0;

		
		for (int i=0; i<pessoa.length;i++) {
            soma += pessoa[i].getAltura();
            if (pessoa[i].getIdade() < 16) {
            	menoresDezesseis++;
            }
		}

		media = soma / pessoa.length;
		percentualMenoresDezesseis =  (double) menoresDezesseis /  pessoa.length * 100.00;
        
		System.out.println();
		System.out.printf("Altura média: %.2f\n",media);
		System.out.printf("Pessoas com menos de 16 anos: %.2f\n", percentualMenoresDezesseis);
		
		for (int i = 0; i < pessoa.length; i++  ) {
			 if (pessoa[i].getIdade() < 16) {
				 System.out.println(pessoa[i].getNome());
			 }
		}
		
		sc.close();
		
	}
}
