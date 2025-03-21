package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hospede;

public class Pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados ?");
		int n = sc.nextInt();
		sc.nextLine();
		
        Hospede[] hospede = new Hospede[10];		
        
        
		for (int i = 0; i < n; i++) {
			System.out.printf("Quarto #%d\n", i+1);
			System.out.print("Nome : ");
            String nome = sc.nextLine();

            System.out.print("Email : ");
            String email = sc.nextLine();

            System.out.print("Quarto : ");
            int quarto = sc.nextInt();
            sc.nextLine();
            System.out.println();
            hospede[(quarto-1)] = new Hospede(nome, email);
		}
		
		for (int i =0; i<10; i++) {
			if (hospede[i] != null) {
				System.out.println((i+1) + " : " + hospede[i]);
			}
		}
		
		
		sc.close();
	}

}
