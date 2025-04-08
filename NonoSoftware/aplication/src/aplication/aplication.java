package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.ImportedProduct;
import entities.Individual;
import entities.Product;
import entities.TaxPayer;
import entities.UsedProduct;

public class aplication {

	public static void main(String[] args) throws ParseException {
		int opcao = 1;
		
		switch (opcao) {
			case 0:
				exercicio1();
				break;
			case 1:
				exercicio2();
				break;
			default:
				System.out.println("Escolha qual opção!");
				break;
		}
		
	}

	public static void exercicio1() throws ParseException {
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
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
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

	public static void exercicio2() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxPayer= new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i +  " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anual = sc.nextDouble();
			switch (ch) {
				case 'i':
					System.out.print("Health expenditures: ");
					double health = sc.nextDouble();
					taxPayer.add(new Individual(name, anual, health));
					break;
				default:
					System.out.print("Number of employees: ");
					int employees = sc.nextInt();
					taxPayer.add(new Company(name, anual, employees));
					break;
			}
		}		
		System.out.println();
		System.out.println("TAXES PAID:");
		double totalTax = 0.0;
		for (TaxPayer obj : taxPayer) {
			totalTax += obj.tax();
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("TOTAL TAXES: " + String.format("%.2f", totalTax));
		sc.close();
	}
}
