package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		String path  = "/home/jsleles/temp/vendas.csv";
		String pathOut = "/home/jsleles/temp/out";
		boolean success = new File(pathOut).mkdir();
		List<Produto> produtos = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] colunas = line.split(",");
				
				String nome = colunas[0];
				Double precoUnitario = Double.parseDouble( colunas[1]);
				Integer quantidade = Integer.parseInt(colunas[2]);

				produtos.add(new Produto(nome, precoUnitario, quantidade));
                
				line = br.readLine();
			}
			String arquivoSaida = pathOut + "/summary.csv";
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoSaida))) {
				for (Produto produto: produtos  ) {
					String lineOut = produto.getNome() + " , " + String.format("%.2f", produto.precoTotal() );
					bw.write(lineOut);
					bw.newLine();
				}

				System.out.println("Arquivo " + arquivoSaida + " criado com sucesso.");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
		
	}

}
