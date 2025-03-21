package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Entre com o número de Pessoas: ");
		int n = sc.nextInt();
		sc.hasNextLine();
		for (int i=1; i<=n; i++) {
			System.out.println("Dados da pessoa #"+i);
			System.out.print("Pessoa fisica ou juridica (f/j)? ");
			char tipoPessoa = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome : ");
			String nome = sc.nextLine();
			System.out.print("Renda Anual : ");
			Double rendaAnual = sc.nextDouble();
			sc.nextLine();
			if (tipoPessoa == 'f') {
				System.out.print("Despesas medicas :");
				Double gastosSaude = sc.nextDouble();
                sc.nextLine();
				list.add( new PessoaFisica (nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Número de funcionarios : ");
				int numeroDeFuncionarios = sc.nextInt();
				sc.nextLine();
				list.add( new PessoaJuridica (nome, rendaAnual, numeroDeFuncionarios));
			}
		}

		System.out.println();
		System.out.println("Impostos pagos");
        double sum = 0.0;
		for (Pessoa pessoa:list) {
			System.out.println( pessoa.getNome() + ": $ " + String.format("%.2f" ,  pessoa.impostoPago()) );
			sum += pessoa.impostoPago();
		}
		
		System.out.println();
		System.out.println("Total Imposto Arrecadado: $ " + String.format("%.2f", sum));
		
		sc.close();
		
		
	}

}
