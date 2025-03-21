package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email : ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY) :" );
		Date birthDate = sdf.parse(sc.nextLine());
		
        Client client = new Client(name,email, birthDate);
        
        System.out.println("Enter order data: ");
        System.out.print("Status : ");
        String orderStatus = sc.nextLine();

        
        System.out.println();
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        Order order = new Order (new Date(),OrderStatus.valueOf(orderStatus), client);
        
        for (int i = 1; i <=n; i++) {
        	System.out.println("Enter #" + i + " item data:");
        	System.out.print("Product name : ");
        	String productName = sc.nextLine();
        	System.out.print("Product price :");
        	Double productPrice = sc.nextDouble();
        	sc.nextLine();
        	System.out.print("Quantiy : ");
        	Integer productQuantity = sc.nextInt();
        	sc.nextLine();
            OrderItem orderItem = new OrderItem(productQuantity, productPrice,  new Product(productName, productPrice));
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);
        
		sc.close();
		
	}

}
