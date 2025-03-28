package exercicio_188;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> students = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i=1; i<= n; i++) {
			int codigo = sc.nextInt();
			students.add(codigo);
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i=1; i<= n; i++) {
			int codigo = sc.nextInt();
			students.add(codigo);
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i=1; i<= n; i++) {
			int codigo = sc.nextInt();
			students.add(codigo);
		}
		
		System.out.printf("Total students: %d", students.size());
		sc.close();
		
	}

}
