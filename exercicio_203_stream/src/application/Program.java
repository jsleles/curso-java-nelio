package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String path = "/home/lelestech/temp/in.txt";
		
		List<Funcionario> listFunc = new ArrayList<>();
		
		try (BufferedReader rd = new BufferedReader (new FileReader(path)) ) {
			String line = rd.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String nome = fields[0];
				String mail = fields[1];
				Double salario = Double.parseDouble(fields[2]);
				listFunc.add(new Funcionario (nome,mail,salario));
				line = rd.readLine();
			}


			Comparator<String> comp = (p1, p2) -> p1.toUpperCase().compareTo(p2.toUpperCase());
			
			List<String> mails = listFunc.stream()
					             .map(Funcionario::getMail)
                                 .sorted(comp)					             
					             .collect(Collectors.toList());
			
			mails.forEach(System.out::println);
					            		 
			Double somaSalario = listFunc.stream()
					             .filter(f -> f.getNome().startsWith("M"))
		                         .mapToDouble(Funcionario::getSalario)
		                         .sum();
                                		
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", somaSalario));
			System.out.println();
			
			
		} catch (IOException e) {
			System.out.println("Erro = " + e.getMessage());
		}
		
	}

}
