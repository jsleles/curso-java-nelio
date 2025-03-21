package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.nome = sc.nextLine();
		student.nota1 = sc.nextDouble();
		sc.nextLine();
		student.nota2 = sc.nextDouble();
		sc.nextLine();
		student.nota3 = sc.nextDouble();
		sc.nextLine();

		System.out.println(student.gradeFinal());
		
		
		
		sc.close();
		
	}

}
