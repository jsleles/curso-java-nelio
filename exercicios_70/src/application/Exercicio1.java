package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1 {

	public static void main(String[] args) {
        double area = 0;
        double perimetro = 0;
        double diagonal = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height");
		rectangle.width = sc.nextDouble();
		rectangle.heigth = sc.nextDouble();
		
		area = rectangle.Area();
		perimetro = rectangle.Perimeter();
		diagonal = rectangle.Diagonal();
		
		System.out.printf("AREA = %.2f\n",area  );
		System.out.printf("PERIMETER = %.2f\n",perimetro  );
		System.out.printf("DIAGONAL = %.2f\n",diagonal  );
	
				
				
		sc.close();		
		
		
	}

}
