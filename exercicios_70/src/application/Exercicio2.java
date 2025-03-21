package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double percentage;
		
		
		Employee employee = new Employee();
        System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary :");
		employee.grossSalary = sc.nextDouble();
		sc.nextLine();
		System.out.print("Tax :");
		employee.tax = sc.nextDouble();
		sc.nextLine();

		System.out.println("Employee: " + employee);
		System.out.print("Wich percentage to increase salary? ");
		percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		sc.nextLine();
		
		System.out.println("Updated data : " + employee);
		
		
		sc.close();
		
	}

}
