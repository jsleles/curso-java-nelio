package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        
        for (int i = 1; i<= n; i++) {
        	System.out.println("Product #" + i + " data:");
        	System.out.print("Common, used or imported (c/u/i)? ");
        	char tipoProduct = sc.next().charAt(0);
        	sc.nextLine();
            System.out.print("Name : ");
            String name = sc.nextLine();
            System.out.print("Price : ");
            Double price = sc.nextDouble();
            
            if (tipoProduct == 'c') {
            	list.add( new Product (name,price));
            }
            else if (tipoProduct == 'i') {
            	System.out.print("Customs fee : ");
            	Double customsFee = sc.nextDouble();
            	list.add( new ImportedProduct (name, price, customsFee));
            }
            else if (tipoProduct == 'u') {
            	System.out.print("Manufacture date (DD/MM/YYYY): ");
            	Date manufactureDate = sdf.parse(sc.next());
            	list.add( new UsedProduct ( name, price, manufactureDate ));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS");
        for (Product product : list) {
        	System.out.println( product.priceTag());
        }
		
		sc.close();
	}

}
