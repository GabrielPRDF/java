package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import etities.Client;
import etities.Order;
import etities.OrderItem;
import etities.Product;
import etities.enuns.OrderStatus;

public class Aplication {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy"); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
//		System.out.println();
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		System.out.println();
		Date data = stf.parse(sc.next());
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.println();
		Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, data));
		System.out.print("How many items to this order? ");
		int itens = sc.nextInt();
		System.out.println();
		int i = 0;
		while(i < itens) {
			i++;
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String nameProduct = sc.next();
			System.out.print("Product price: ");
			Double priceProduct = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantityProduct = sc.nextInt();
			order.addItem(new OrderItem(quantityProduct, priceProduct, new Product(nameProduct, priceProduct)));
		}
		System.out.println(order);
		sc.close();
	}

}
