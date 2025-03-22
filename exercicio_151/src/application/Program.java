package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Program {
    //teste git
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder : ");
		String holder = sc.nextLine();
		System.out.print("Initial balanced : ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit : ");
		double withdraw = sc.nextDouble();
		sc.nextLine();
	   	Account account = new Account(number, holder, balance, withdraw);
	   	
	   	System.out.println();
	   	System.out.print("Enter amount for withdraw :");
	   	double ammount = sc.nextDouble();
		   	
		try {
		   	account.withdraw(ammount);
		   	System.out.printf("New balance : %.2f", account.getBalance());
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
     
		sc.close();
	}
}
