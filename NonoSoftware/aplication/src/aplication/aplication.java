package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class aplication {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i +  " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
//			System.out.println();
			System.out.print("Name: ");
			String name = sc.next();
//			System.out.println();
			System.out.print("Price: ");
			double price = sc.nextDouble();
//			System.out.println();
			switch (ch) {
				case 'u':
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					Date date = sdf.parse(sc.next());
					products.add(new UsedProduct(name, price, date));
					break;
				case 'i':
					System.out.print("Customs fee: ");
					double customsFree = sc.nextDouble();
					products.add(new ImportedProduct(name, price, customsFree));
					break;
				default:
					products.add(new Product(name, price));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product obj : products) {
			System.out.print(obj.priceTag());
		}
		sc.close();
	}

}
