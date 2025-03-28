package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String path = "/home/jsleles/temp/in.txt";
		
		Map<String, Integer> votacao = new HashMap <>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				String candidato = fields[0];
				int    votos     = Integer.parseInt(fields[1].trim());
			
/*
				Integer totVotos = votacao.get(candidato);
				if (totVotos == null) {
					totVotos = votos;
				} else {
					totVotos += votos;
				}
				votacao.put(candidato, totVotos);				
*/					
				//     OU
				
				if (votacao.containsKey(candidato)) {
					int totVotos = votacao.get(candidato);
					votacao.put(candidato, votos + totVotos);
				}
				else {
					votacao.put(candidato, votos);
				}				

				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
		
        for (String key : votacao.keySet()) {
        	System.out.println( key + " votos = " + votacao.get(key));
        }
	
	}

}
