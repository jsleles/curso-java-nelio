package entities;

public class Conversor {
	
	public static double valorEmReais (double cotacaoDolar, double totalDolar) {
		
		return cotacaoDolar * totalDolar * 1.06;
	}

}
