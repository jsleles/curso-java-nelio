package application;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import entities.Pessoa;

public class Program2 {

	public static void main(String[] args) {
		Pessoa pessoas = new Pessoa();
		List<Pessoa> list = pessoas.populaPessoas();
	//	list.forEach(System.out::println);
		
		Stream<String> stream = list.stream()
				                .filter(p -> p.getNacionalide().equals("Brasil"))
				                .map(Pessoa::getNome);
		
		stream.forEach(System.out::println);
		
	}

}
