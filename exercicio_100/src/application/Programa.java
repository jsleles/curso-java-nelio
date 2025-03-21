package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//teste agora acho que vai dar certo
		
		System.out.print("Quantos empregados serão registrados? ");
		int n = sc.nextInt();
		sc.nextLine();
	
		List<Empregado>   listaEmpregados = new ArrayList<>();
 
		for (int i=1; i<=n; i++) {
			System.out.printf("Empregado #%d\n", i);
            System.out.print("ID :");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome :");
			String nome = sc.nextLine();
			System.out.print("Salario : ");
            double salario = sc.nextDouble();
            sc.nextLine();
            System.out.println();

            Empregado empregado = new Empregado(id, nome, salario);			
            listaEmpregados.add(empregado);
		}
		
        System.out.println();
		System.out.print("Entre com o ID do empregado que receberá aumento de Salario : ");
		int idAumento = sc.nextInt();
		sc.nextLine();
		
		//Integer posicaoId  =  posicao (listaEmpregados, idAumento);
		Empregado emp = listaEmpregados.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		
		
//		if (posicaoId == null) {
	    if (emp == null) {
		   System.out.println("Esse id não existe!");
			
		} else {
			System.out.print("Entre com o percentual de aumento: ");
			double percAumento = sc.nextDouble();
			sc.nextLine();
//			listaEmpregados.get(posicaoId).aumentaSalario(percAumento);
			emp.aumentaSalario(percAumento);
		}
		
		
		for (Empregado empregado : listaEmpregados) {
			System.out.println(  empregado);
		}
		
		sc.close();
		
	}


	private static Integer posicao (List<Empregado>  listaEmpregados , int id) {
		for (Integer i=0; i< listaEmpregados.size(); i++) {
			if (listaEmpregados.get(i).getId() == id) {
				return i;
			} 
		}
		return null;
	}

}

