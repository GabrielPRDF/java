package application;

import java.util.Scanner;

import entities.Employee;
import entities.Retangulo;

public class Programa {
	
	public static void main(String[] args) {
		int exercicio = 3;
		
		/*
		 * Exercicio 1
		 * Fazer um programa para ler os valores da largura e altura
		 * de um retângulo. Em seguida, mostrar na tela o valor de
		 * sua área, perímetro e diagonal. Usar uma classe como
		 * mostrado no projeto ao lado.
		 */
		if (exercicio == 1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Insert the height and width:");
			Retangulo x = new Retangulo();
			x.height = sc.nextDouble();
			x.width = sc.nextDouble();
			System.out.println("Area: " + x.area());
			System.out.println("Perimeter: " + x.perimetro());
			System.out.println("Diagonal: " + x.diagonal());
			sc.close();
		}
		
		if (exercicio == 2) {
			Scanner sc = new Scanner(System.in);
			Employee person = new Employee();
			System.out.println("Insert the name:");
			person.name = sc.nextLine();
			System.out.println("Insert the Gross salary:");
			person.grossSalary = sc.nextDouble();
			System.out.println("Insert Tax:");
			person.tax = sc.nextDouble();
			person.printSalary();
			person.increaseSalary();
			person.printSalary();
			sc.close();
		}
		
		if (exercicio == 3) {
			
		}
		
	}
}
