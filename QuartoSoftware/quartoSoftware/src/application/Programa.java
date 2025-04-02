package application;

import java.util.Scanner;

import entities.Employee;
import entities.Retangulo;
import entities.Student;

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
		
		/*
		 * Exercicio 2
		 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
		 * Em seguida, mostrar os dados do funcionário (nome e salário líquido).
		 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada 
		 * (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados 
		 * do funcionário. Use a classe projetada abaixo.
		 */
		
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
			Scanner sc = new Scanner(System.in);
			Student person = new Student();
			System.out.println("Insert the name:");
			person.nameAluno = sc.nextLine();
			System.out.println("Insert score 1:");
			person.tri1 = sc.nextDouble();
			System.out.println("Insert score 2:");
			person.tri2 = sc.nextDouble();
			System.out.println("Insert score 3:");
			person.tri3 = sc.nextDouble();
			person.resultado();
		}
		
	}
}
