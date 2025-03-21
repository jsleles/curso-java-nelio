package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		double deposit = 0.0;
		double saque   = 0.0;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)");
		char initialDeposit = sc.nextLine().charAt(0);
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit value :");
            deposit = sc.nextDouble();
            sc.nextLine();
            
            conta = new Conta(accountNumber, accountHolder, deposit);
            		
		} else {
			
			conta = new Conta(accountNumber, accountHolder);
		}

		System.out.println("Account data : " + conta);

		System.out.print("Enter a deposit value: " );
		deposit = sc.nextDouble();
		sc.nextLine();
		conta.depositar(deposit);
		System.out.println("Updated account data : ");
		System.out.println(conta);
		
		System.out.print("Enter a witdraw value : ");
		saque = sc.nextDouble();
		conta.sacar(saque);
		sc.nextLine();
		
		System.out.println("Updated account data :");
		System.out.println(conta);
		
		
		sc.close();
		
		
	}

}
